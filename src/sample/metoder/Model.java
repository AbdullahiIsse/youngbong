package sample.metoder;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class Model {

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
}
