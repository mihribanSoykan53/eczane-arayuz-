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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class kayitController  {
    @FXML
    private Button kaydetBtn1;

    @FXML
    private TextField adtext;

    @FXML
    private TextField kimliktext;

    @FXML
    private TextField randevutext;

    @FXML
    private TextField mailtext;

    @FXML
    private TextField telefontext;
    private String dizi[] = new String[100];

    @FXML
    void kaydetBtn1Fonk(ActionEvent event) throws IOException {

      for (int i=0;i<1;i++){
    dizi[i]=adtext.getText();
    dizi[i+1]=kimliktext.getText();
    dizi[i+2]=randevutext.getText();
    dizi[i+3]=mailtext.getText();
    dizi[i+4]=telefontext.getText();
          BufferedWriter bwriter=new BufferedWriter(new FileWriter("kayıt.txt",true));
          bwriter.write(""+dizi[i]);
          bwriter.flush();
          bwriter.newLine();       //kayıtları dosyaya yazar
          bwriter.close();
}
        JOptionPane.showMessageDialog(null,"Kayıt Başarı İle Gerçekleşmiştir.");
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Stage window=(Stage) kaydetBtn1.getScene().getWindow();
        window.setScene(new Scene(root, 706, 572));
    }



String getDizi(){
        return dizi[5];
}

}
