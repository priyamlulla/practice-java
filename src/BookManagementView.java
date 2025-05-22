import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookManagementView {
    public static void showBookManagement() {
        Stage bookStage = new Stage();
        bookStage.setTitle("Manage Books");

        Button addBookBtn = new Button("Add Book");
        Button updateBookBtn = new Button("Update Book");
        Button deleteBookBtn = new Button("Delete Book");
        Button backBtn = new Button("Back");

        backBtn.setOnAction(e -> bookStage.close()); // Close the window

        VBox layout = new VBox(15, addBookBtn, updateBookBtn, deleteBookBtn, backBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);
        bookStage.setScene(scene);
        bookStage.show();
    }
}
