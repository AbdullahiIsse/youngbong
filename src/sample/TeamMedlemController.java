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
import sample.metoder.Teammedlem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TeamMedlemController implements Initializable {
    @FXML
    private AnchorPane rootpane;
    @FXML
    private TableView<Teammedlem> table;
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


    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/sample.fxml"));
        rootpane.getChildren().setAll(pane);
    }


    public void musklik(MouseEvent mouseEvent) {

        System.exit(0);
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
        table.setItems(list);


    };

}
