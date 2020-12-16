import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ColourITController implements Initializable {
    public ComboBox<String> comboBoxPri;
    public ComboBox comboBoxMedarbejder;
    public ComboBox comboBoxOpgaveID;


    ObservableList<String> listpri = FXCollections.observableArrayList("Høj","Mellem","Lav");


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
comboBoxPri.setItems(listpri);
    }
}
