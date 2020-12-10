package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller {
    @FXML private AnchorPane rootpane;
    @FXML private TreeTableView thetable;


    public void load1(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("gui/kun.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
            "gui/sample.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void load2(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
            "gui/team.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void load3(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
            "gui/opgaver.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
    }

    public void intialize (URL url , ResourceBundle resourceBundle){
        TreeTableColumn navn = new TreeTableColumn("Navn");
        TreeTableColumn telefon = new TreeTableColumn("telefon");
        TreeTableColumn rolle = new TreeTableColumn("rolle");

        thetable.getColumns().addAll(navn,telefon,rolle);


    }


}
