import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        AnchorPane root = FXMLLoader.load(getClass().getResource("/Style/fxmls/main.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }
}