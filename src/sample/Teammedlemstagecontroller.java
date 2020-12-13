package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.metoder.Teammedlem;

import java.io.IOException;

public class Teammedlemstagecontroller  {
    @FXML AnchorPane rootpane;
    @FXML
    private TextField fornavnid;
    @FXML
    private TextField efternavnid;
    @FXML
    private TextField rolleid;
    @FXML
    private TextField telefonnummerid;
   @FXML private TextField teammedlemid;


    @FXML private ObservableList<Teammedlem> list;

    public void loadback(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/sample.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    public void musklik(MouseEvent mouseEvent) {
        System.exit(0);
    }

@FXML
    public void addteam(ActionEvent actionEvent) {
        list.add(new Teammedlem(fornavnid.getText(),
                efternavnid.getText(),
                rolleid.getText(),
                Integer.parseInt(telefonnummerid.getText()),
                Integer.parseInt(teammedlemid.getText())

        ));
    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(
                "gui/team.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    public void setTableItems(ObservableList<Teammedlem> tableItems) {
        this.list = tableItems ;
    }
}
