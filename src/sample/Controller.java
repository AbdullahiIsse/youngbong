package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Controller {
    @FXML private AnchorPane rootpane;


    public void load1(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("kun.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("sample.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void load2(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("team.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void load3(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("opgaver.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
    }


}
