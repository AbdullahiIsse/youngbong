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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.controller.DataObject;
import sample.controller.Member;
import sample.controller.Model;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller {
    @FXML private AnchorPane rootpane;
    @FXML private TableView thetable;


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
        TableColumn <DataObject, String> attribute1Column = new TableColumn<DataObject, String>("Attribute1");
        TableColumn <DataObject, Integer> attribute2Column = new TableColumn<DataObject, Integer>("Attribute2");
        TableColumn <DataObject, String> attribute3Column = new TableColumn<DataObject, String>("Attribute3");

        attribute1Column.setCellValueFactory(new PropertyValueFactory("attribute1"));
        attribute2Column.setCellValueFactory(new PropertyValueFactory("attribute2"));
        attribute3Column.setCellValueFactory(new PropertyValueFactory("attribute3"));

        thetable.getItems().addAll(Model.getMembers());



    }


}
