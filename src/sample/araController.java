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

public class araController {
    @FXML
    private TextField adtext;

    @FXML
    private TextField kimliktext;

    @FXML
    private TextField randevutext;

    @FXML
    private Button araBtn;

    @FXML
    void araBtn1Fonk(ActionEvent event) throws IOException {
        File dosya= new File("kayıt.txt");
        int a = 0;

        FileInputStream fstream=new FileInputStream(dosya);
        DataInputStream dstream=new DataInputStream(fstream);
        BufferedReader breader=new BufferedReader(new InputStreamReader(dstream));
        String str ;

        while((str= breader.readLine())!=null) {
            if(adtext.getText().equals(str)){

               a=1;
            }
            else{
                a=0;
            }


        }

        dstream.close();
        if(a==1){
            JOptionPane.showMessageDialog(null,"Aradığınız hasta sistemimizde kayıtlıdır. ");
        }
        else{
            JOptionPane.showMessageDialog(null,"Aradığınız hasta sistemimizde kayıtlı değildir. ");
        }

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Stage v=(Stage) araBtn.getScene().getWindow();
        v.setScene(new Scene(root, 706, 572));






    }
}
