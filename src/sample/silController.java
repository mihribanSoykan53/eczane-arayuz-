package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;

public class silController {

    @FXML
    private TextField ad;

    @FXML
    private TextField kimlik;

    @FXML
    private TextField tarih;

    @FXML
    private Button silBtn;

    @FXML
    void silFonk(ActionEvent event) throws IOException {
        File dosya= new File("kayıt.txt");

        FileInputStream fstream=new FileInputStream(dosya);
        DataInputStream dstream=new DataInputStream(fstream);
        BufferedReader breader=new BufferedReader(new InputStreamReader(dstream));
        String str ;

        while((str= breader.readLine())!=null) {
            if(ad.getText().equals(str)){
                str="";


        }}

            JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Silinmiştir.");


        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Stage window=(Stage) silBtn.getScene().getWindow();
        window.setScene(new Scene(root, 706, 572));

    }
}
