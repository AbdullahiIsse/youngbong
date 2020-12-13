package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.IntegerStringConverter;
import sample.metoder.Opgaver;
import sample.metoder.Teammedlem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TeamMedlemController implements Initializable {
    @FXML
    private AnchorPane rootpane;
    @FXML
    private TableView<Teammedlem> tableTeammedlem;
    @FXML
    private TableColumn<Teammedlem, String> Fornavn;
    @FXML
    private TableColumn<Teammedlem, String> Efternavn;
    @FXML
    private TableColumn<Teammedlem, String> Rolle;
    @FXML
    private TableColumn<Teammedlem, Integer> Telefonnummer;
    @FXML
    private TableColumn<Teammedlem, Integer> TeammedlemId;
    public void add(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/Teammedlemstage.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public ObservableList<Teammedlem> list = FXCollections.observableArrayList(
            new Teammedlem("tom", "ben", "hej", 10, 200),
            new Teammedlem("tom", "ben", "hej", 10, 200),
            new Teammedlem("tom", "ben", "hej", 10, 200),
            new Teammedlem("tom", "ben", "hej", 10, 200)
    );

    public void initialize(URL location, ResourceBundle rb) {





        Fornavn.setCellValueFactory(new PropertyValueFactory<Teammedlem, String>("Fornavn"));
        Efternavn.setCellValueFactory(new PropertyValueFactory<Teammedlem, String>("Efternavn"));
        Rolle.setCellValueFactory(new PropertyValueFactory<Teammedlem, String>("Rolle"));
        Telefonnummer.setCellValueFactory(new PropertyValueFactory<Teammedlem, Integer>("Telefonnummer"));
        TeammedlemId.setCellValueFactory(new PropertyValueFactory<Teammedlem, Integer>("TeammedlemId"));
        tableTeammedlem.setEditable(true);
        tableTeammedlem.setItems(list);

        Fornavn.setCellFactory(TextFieldTableCell.forTableColumn());
        Efternavn.setCellFactory(TextFieldTableCell.forTableColumn());
        Rolle.setCellFactory(TextFieldTableCell.forTableColumn());
        Telefonnummer.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        TeammedlemId.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

    };


    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
        "gui/sample.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
    }


    public void Editfornavn(TableColumn.CellEditEvent<Teammedlem, String> teammedlemStringCellEditEvent) {
        Teammedlem teammedlem=tableTeammedlem.getSelectionModel().getSelectedItem();
        teammedlem.setFornavn(teammedlemStringCellEditEvent.getNewValue());
    }

    public void editefternavn(TableColumn.CellEditEvent<Teammedlem, String> teammedlemStringCellEditEvent) {
        Teammedlem teammedlem=tableTeammedlem.getSelectionModel().getSelectedItem();
        teammedlem.setEfternavn(teammedlemStringCellEditEvent.getNewValue());
    }

    //pushlknlkn

    public void editrolle(TableColumn.CellEditEvent<Teammedlem, String> teammedlemStringCellEditEvent) {
        Teammedlem teammedlem=tableTeammedlem.getSelectionModel().getSelectedItem();
        teammedlem.setRolle(teammedlemStringCellEditEvent.getNewValue());
    }

    public void edittelefon(TableColumn.CellEditEvent<Teammedlem, Integer> teammedlemIntegerCellEditEvent) {
        Teammedlem teammedlem = teammedlemIntegerCellEditEvent.getRowValue();
        teammedlem.setTelefonnummer(teammedlemIntegerCellEditEvent.getNewValue());
    }

    public void editteamedlem(TableColumn.CellEditEvent<Teammedlem, Integer> teammedlemIntegerCellEditEvent) {
   Teammedlem teammedlem = teammedlemIntegerCellEditEvent.getRowValue();
        teammedlem.setTeammedlemId(teammedlemIntegerCellEditEvent.getNewValue());
    }

    public void RemoveTeammedlem(ActionEvent actionEvent) {
        ObservableList<Teammedlem>sletMedlem, sletMedlemer;
        sletMedlem=tableTeammedlem.getItems();
        sletMedlemer=tableTeammedlem.getSelectionModel().getSelectedItems();
        sletMedlemer.forEach(sletMedlem::remove);
    }


}
