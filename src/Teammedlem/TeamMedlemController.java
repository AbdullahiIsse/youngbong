package Teammedlem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.converter.IntegerStringConverter;
import parser.ParserException;
import parser.XmlJsonParser;
import sample.metoder.Opgaver;
import sample.metoder.Teammedlem;

import javax.crypto.Mac;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TeamMedlemController implements Initializable {
    public TextField Efternavn1;
    public TextField Fornavn1;
    public TextField Rolle1;
    public TextField Tel1;
    public TextField teamID1;
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
    private Window primaryStage;
    private Teammedlem Teammedlem;


    public void add(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/Teammedlemstage.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    public ObservableList<Teammedlem> list = FXCollections.observableArrayList(
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


    public void createNew(ActionEvent actionEvent) {
        Teammedlem teammedlem = new Teammedlem(Fornavn1.getText(), Efternavn1.getText(),Rolle1.getText(),Integer.parseInt(Tel1.getText()),Integer.parseInt(teamID1.getText()));
        tableTeammedlem.getItems().add(teammedlem);
    }

    public void save(ActionEvent actionEvent) throws ParserException {

        FileChooser fileChooser = new FileChooser();


        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("XMl files (*.xml)", "*.xml");
        fileChooser.getExtensionFilters().add(extFilter);


        File file = fileChooser.showSaveDialog(primaryStage);



    }

    private void SaveFile(sample.metoder.Teammedlem teammedlem, File file) {


        try {
            FileWriter fileWriter;

            fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(teammedlem));
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Teammedlem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }



}
