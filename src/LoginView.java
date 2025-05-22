import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management System - Login");

        // Create UI Elements
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("Login");
        Label messageLabel = new Label();

        // Handle Login Button Click
        loginButton.setOnAction(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();

            boolean isAuthenticated = LoginController.authenticate(email, password);
            if (isAuthenticated) {
                messageLabel.setText("Login Successful!");
                DashboardView.showDashboard();
                primaryStage.close(); // Close login window
            } else {
                messageLabel.setText("Invalid email or password.");
            }
        });

        // Arrange UI
        VBox layout = new VBox(10, emailLabel, emailField, passwordLabel, passwordField, loginButton, messageLabel);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 350, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
