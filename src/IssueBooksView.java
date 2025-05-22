import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IssueBooksView {
    public static void showIssueBooks() {
        Stage issueStage = new Stage();
        issueStage.setTitle("Issue & Return Books");

        Button issueBookBtn = new Button("Issue Book");
        Button returnBookBtn = new Button("Return Book");
        Button backBtn = new Button("Back");

        backBtn.setOnAction(e -> issueStage.close()); // Close the window

        VBox layout = new VBox(15, issueBookBtn, returnBookBtn, backBtn);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);
        issueStage.setScene(scene);
        issueStage.show();
    }
}

