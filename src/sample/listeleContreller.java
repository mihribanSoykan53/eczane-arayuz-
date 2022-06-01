package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class listeleContreller {

    @FXML
    private Button btnDön;

    @FXML
    void donhndl(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Stage window=(Stage) btnDön.getScene().getWindow();
        window.setScene(new Scene(root, 706, 572));
    }
}
