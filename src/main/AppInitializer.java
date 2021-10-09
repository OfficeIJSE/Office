package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @auther : Madhushani Gamage
 * @Data : / / 2021
 **/
public class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) {

        try {

            Parent root = FXMLLoader.load(this.getClass().getResource("/view/DashboardForm.fxml"));

            Scene mainScene = new Scene(root);
            primaryStage.setScene(mainScene);
            primaryStage.setResizable(false);

            primaryStage.show();


        } catch (IOException ex) {
            Logger.getLogger(AppInitializer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(AppInitializer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
