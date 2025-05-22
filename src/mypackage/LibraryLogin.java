package mypackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LibraryLogin extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private Connection conn;

    public LibraryLogin() {
        setTitle("Library Management System - Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        userField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        add(userLabel); add(userField);
        add(passLabel); add(passField);
        add(new JLabel()); add(loginButton);

        connectDatabase();
        setVisible(true);
    }

    private void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "password");
            System.out.println("Database Connected!");
        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                dispose();
                Platform.runLater(() -> new LibraryDashboard().start(new Stage()));
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Credentials!");
            }
        } catch (Exception ex) {
            System.out.println("Login Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LibraryLogin::new);
    }
}

class LibraryDashboard extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Dashboard");
        StackPane root = new StackPane();
        root.getChildren().add(new Label("Welcome to the Library Management System!"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}