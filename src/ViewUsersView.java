
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewUsersView {
    public static void showUsers() {
        Stage usersStage = new Stage();
        usersStage.setTitle("View Users");

        Button backBtn = new Button("Back");

        backBtn.setOnAction(e -> usersStage.close()); // Close the window

        VBox layout = new VBox(15, backBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);
        usersStage.setScene(scene);
        usersStage.show();
    }
}
