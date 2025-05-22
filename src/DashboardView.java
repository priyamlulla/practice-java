import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DashboardView {
    public static void showDashboard() {
        Stage dashboardStage = new Stage();
        dashboardStage.setTitle("Library Management System - Dashboard");

        // Buttons for different functionalities
        Button manageBooksBtn = new Button("Manage Books");
        Button issueBooksBtn = new Button("Issue Books");
        Button viewUsersBtn = new Button("View Users");
        Button exitBtn = new Button("Exit");

        // Set button actions
        manageBooksBtn.setOnAction(e -> BookManagementView.showBookManagement());
        issueBooksBtn.setOnAction(e -> IssueBooksView.showIssueBooks());
        viewUsersBtn.setOnAction(e -> ViewUsersView.showUsers());
        exitBtn.setOnAction(e -> dashboardStage.close()); // Close the window on exit

        // Layout
        VBox layout = new VBox(15, manageBooksBtn, issueBooksBtn, viewUsersBtn, exitBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);
        dashboardStage.setScene(scene);
        dashboardStage.show();
    }
}
