package sample;

import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import sample.metoder.Model;

public class ViewHandler {

    private Scene currentScene;
    private Stage primaryStage;

    private forsideController forsideController;
    private KundeController kundeController;
    private TeamMedlemController teamMedlemController;
    private OpgaveController opgaveController;

    private Model model;

    public ViewHandler(Model model)
    {
        this.model = model;
        currentScene = new Scene(new Region());
    }



}
