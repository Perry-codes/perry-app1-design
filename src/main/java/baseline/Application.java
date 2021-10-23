package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ToDoListGui.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();
    }
}
