package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.IntegerStringConverter;
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

        table.setEditable(true);

        Fornavn.setCellValueFactory(new PropertyValueFactory<Kunde,String>("Fornavn"));
        Fornavn.setCellFactory(TextFieldTableCell.forTableColumn());
        Fornavn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Kunde, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Kunde, String> kundeStringCellEditEvent) {
                Kunde kunde = kundeStringCellEditEvent.getRowValue();
                kunde.setFornavn(kundeStringCellEditEvent.getNewValue());
            }
        });


        Efternavn.setCellValueFactory(new PropertyValueFactory<Kunde,String>("Efternavn"));
        Efternavn.setCellFactory(TextFieldTableCell.forTableColumn());
        Efternavn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Kunde, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Kunde, String> kundeStringCellEditEvent) {
                Kunde kunde = kundeStringCellEditEvent.getRowValue();
                kunde.setEfternavn(kundeStringCellEditEvent.getNewValue());

            }
        });

        Telefonnummer.setCellValueFactory(new PropertyValueFactory<Kunde,Integer>("Telefonnummer"));
        Telefonnummer.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        Telefonnummer.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Kunde, Integer>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Kunde, Integer> kundeIntegerCellEditEvent) {
                Kunde kunde = kundeIntegerCellEditEvent.getRowValue();
                kunde.setTelefonnummer(kundeIntegerCellEditEvent.getNewValue());

            }
        });

        table.setItems(list);

    }

    public void Add(ActionEvent actionEvent) throws IOException {

        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/Kundestage.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void remove(ActionEvent actionEvent) {

        ObservableList<Kunde>sletOpgave, sletOpgaver;
        sletOpgave=table.getItems();
        sletOpgaver=table.getSelectionModel().getSelectedItems();
        sletOpgaver.forEach(sletOpgave::remove);
    }
}
