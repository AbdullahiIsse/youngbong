package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.metoder.Kunde;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class KundeController implements Initializable {
    @FXML
    private AnchorPane rootpane;
    @FXML private TableView<Kunde>table;
    @FXML private TableColumn<Kunde,String>Fornavn;
    @FXML private TableColumn<Kunde,String>Efternavn;
    @FXML private TableColumn<Kunde, Integer> Telefonnummer;


    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
            "gui/sample.fxml"));
        rootpane.getChildren().setAll(pane);
    }



    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
    }


    public ObservableList<Kunde>list = FXCollections.observableArrayList(
            new Kunde("tom","ben", 12345678),
            new Kunde("tom","ben", 12345678),
            new Kunde("tom","ben", 12345678),
            new Kunde("tom","ben", 12345678)

    );



    public void initialize(URL location, ResourceBundle rb){
        Fornavn.setCellValueFactory(new PropertyValueFactory<Kunde,String>("Fornavn"));
        Efternavn.setCellValueFactory(new PropertyValueFactory<Kunde,String>("Efternavn"));
        Telefonnummer.setCellValueFactory(new PropertyValueFactory<Kunde,Integer>("Telefonnummer"));
        table.setItems(list);


    }








}
