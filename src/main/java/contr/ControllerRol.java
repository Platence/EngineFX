package contr;

import enginePack.Engine;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

public class ControllerRol {
    @FXML
    private Pane mainPane;

    public Pane getMainPane() {
        return mainPane;
    }

    public void initialize(){
        new Engine(this);
    }
}
