package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class menuController {

    @FXML
    private Button kayitBtn;

    @FXML
    private Button silBtn;

    @FXML
    private Button listeBtn;

    @FXML
    private Button araBtn;

    @FXML
    private AnchorPane panel;

    @FXML
    void ara(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ara.fxml"));
        Stage v=(Stage) araBtn.getScene().getWindow();
        v.setScene(new Scene(root, 706, 572));
    }
    @FXML
    void kayit(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("kayit.fxml"));
        Stage a=(Stage) kayitBtn.getScene().getWindow();
        a.setScene(new Scene(root, 706, 572));
    }

    @FXML
    void listele(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("listele.fxml"));
        Stage v=(Stage) listeBtn.getScene().getWindow();
        v.setScene(new Scene(root, 706, 572));
    }

    @FXML
    void sil(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sil.fxml"));
        Stage b=(Stage) silBtn.getScene().getWindow();
        b.setScene(new Scene(root, 706, 572));
    }









}
