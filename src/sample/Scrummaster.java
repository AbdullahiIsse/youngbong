package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.controlsfx.control.Notifications;


import javax.management.Notification;
import java.io.IOException;

public class Scrummaster {
    @FXML private AnchorPane rootpane;

   public void loadback(ActionEvent actionEvent) throws IOException {

       AnchorPane pane = FXMLLoader.load(getClass().getResource(
               "gui/sample.fxml"));
       rootpane.getChildren().setAll(pane);
    }

    public void kunde(ActionEvent actionEvent) throws IOException {

       AnchorPane pane = FXMLLoader.load(getClass().getResource("gui/kun.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    public void opgave(ActionEvent actionEvent) throws IOException {

       AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/opgaver.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void Teammedlem(ActionEvent actionEvent) throws IOException {

       AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/team.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void musklik(MouseEvent mouseEvent) {

       System.exit(0);


    }


    public void mousedragged(MouseEvent mouseEvent) throws InterruptedException {

       Notifications.create()
               .title("Color IT")
               .text("SE VORES HJEMMESIDE FOR MERE INFO").darkStyle().showWarning();
    }


}
