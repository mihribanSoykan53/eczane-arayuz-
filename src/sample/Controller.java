package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
//import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements  Initializable {
    @FXML
    private TextField kul_text;

    @FXML
    private PasswordField sifre_text;

    @FXML
    private CheckBox sifre_checkbox;

    @FXML
    private Button giris_btn;
    @FXML
    private AnchorPane panel=null;

    @FXML
    void kullanıcı_giris(ActionEvent event) throws IOException {
        String id ="1111";
        String kul_ad="admin";
        if(kul_text.getText().equals(kul_ad)&& sifre_text.getText().equals(id)){
           // JOptionPane.showMessageDialog(null,"giriş yapıldı");
            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
          Stage window=(Stage) giris_btn.getScene().getWindow();
          window.setScene(new Scene(root, 706, 572));
        }
        else{
            JOptionPane.showMessageDialog(null,"kullanıcı bilgilerinizi kontrol edin! ");
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
