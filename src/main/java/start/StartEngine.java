package start;

import com.sun.istack.internal.NotNull;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StartEngine extends Application {


    public static final int MAXSIZEXY = 1000;

    public void start(Stage primaryStage) throws IOException {
        @NotNull
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("startEx.fxml")));
        Scene scene = new Scene(root,MAXSIZEXY,MAXSIZEXY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
