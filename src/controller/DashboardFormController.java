package controller;

import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @auther : Madhushani Gamage
 * @Data : / / 2021
 **/
public class DashboardFormController implements Initializable {

    public AnchorPane rootDash;
    public JFXButton btnCustomer;
    public JFXButton btnItem;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setUI("DashboardForm.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUI(String location) throws IOException {
        rootDash.getChildren().clear();
        AnchorPane load = FXMLLoader.load(this.getClass().getResource("../view/" + location));
        rootDash.getChildren().addAll(load.getChildren());


    }

    public void customerOnAction(ActionEvent actionEvent) throws IOException {
        setUI("CustomerForm.fxml");
    }

    public void itemOnAction(ActionEvent actionEvent) throws IOException {
        setUI("ItemForm.fxml");
    }


}
