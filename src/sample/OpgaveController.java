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
import sample.metoder.Opgaver;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OpgaveController implements Initializable {
    public TextField opgavetekst1;
    public TextField krav1;
    public TextField tidsestimat1;
    public TextField Prioritetsniveau1;
    public Button slet;
    @FXML
    private AnchorPane rootpane;
    @FXML
    private TableView<Opgaver> tableViewOpgaver;
    @FXML
    private TableColumn<Opgaver, String> opgavetekst;
    @FXML
    private TableColumn<Opgaver, String> Krav;
    @FXML
    private TableColumn<Opgaver, Integer> estimat;
    @FXML
    private TableColumn<Opgaver, String> prioritetsniveau;



    public ObservableList<Opgaver> Opgaveliste = FXCollections.observableArrayList(
            new Opgaver("tom", "ben", 12345678, "Høj"),
            new Opgaver("tom", "ben", 12345678, "lav")
    );


    public void initialize(URL location, ResourceBundle rb) {
        opgavetekst.setCellValueFactory(new PropertyValueFactory<Opgaver, String>("Opgavetekst"));
        Krav.setCellValueFactory(new PropertyValueFactory<Opgaver, String>("Krav"));
        estimat.setCellValueFactory(new PropertyValueFactory<Opgaver, Integer>("Estimat"));
        prioritetsniveau.setCellValueFactory(new PropertyValueFactory<Opgaver, String>("Prioritetsniveau"));
        tableViewOpgaver.setItems(Opgaveliste);
        tableViewOpgaver.setEditable(true);
        opgavetekst.setCellFactory(TextFieldTableCell.forTableColumn());
        Krav.setCellFactory(TextFieldTableCell.forTableColumn());
        estimat.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        prioritetsniveau.setCellFactory(TextFieldTableCell.forTableColumn());

    }


    public void OneditOpgavetekst(TableColumn.CellEditEvent<Opgaver, String> opgaverStringCellEditEvent) {
        Opgaver opgave=tableViewOpgaver.getSelectionModel().getSelectedItem();
       opgave.setOpgavetekst(opgaverStringCellEditEvent.getNewValue());
    }

    public void OneditOpgavekrav(TableColumn.CellEditEvent<Opgaver, String> opgaverStringCellEditEvent) {
        Opgaver opgave=tableViewOpgaver.getSelectionModel().getSelectedItem();
        opgave.setKrav(opgaverStringCellEditEvent.getNewValue());
    }

    public void OneditOpgaveestimat(TableColumn.CellEditEvent<Opgaver, Integer> opgaverIntegerCellEditEvent) {
        Opgaver opgaver = opgaverIntegerCellEditEvent.getRowValue();
        opgaver.setEstimat(opgaverIntegerCellEditEvent.getNewValue());
    }

    public void OneditOpgaveprio(TableColumn.CellEditEvent<Opgaver, String> opgaverStringCellEditEvent) {
        Opgaver opgave=tableViewOpgaver.getSelectionModel().getSelectedItem();
        opgave.setPrioritetsniveau(opgaverStringCellEditEvent.getNewValue());
    }

    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/sample.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
    }

    public void Nyside(ActionEvent actionEvent) {
        Opgaver opgave = new Opgaver(opgavetekst1.getText(), krav1.getText(),Integer.parseInt(tidsestimat1.getText()),Prioritetsniveau1.getText());
        tableViewOpgaver.getItems().add(opgave);
    }

    public void Slet(ActionEvent event)
    {
        ObservableList<Opgaver>sletOpgave, sletOpgaver;
        sletOpgave=tableViewOpgaver.getItems();
        sletOpgaver=tableViewOpgaver.getSelectionModel().getSelectedItems();
        sletOpgaver.forEach(sletOpgave::remove);
    }
}



