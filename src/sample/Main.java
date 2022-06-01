package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;

public class Main extends Application {
    ImageView imageView;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("klinik yönetim sistemi");
        primaryStage.setScene(new Scene(root, 706, 572));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
