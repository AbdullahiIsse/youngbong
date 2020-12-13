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
import javafx.scene.layout.AnchorPane;
import sample.metoder.Opgaver;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OpgaveController implements Initializable {
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

    }


    public void ButtonSlet(javafx.event.ActionEvent actionEvent) {
        ObservableList<Opgaver>sletOpgave, sletOpgaver;
        sletOpgave=tableViewOpgaver.getItems();
        sletOpgaver=tableViewOpgaver.getSelectionModel().getSelectedItems();
        sletOpgaver.forEach(sletOpgave::remove);
    }
}



