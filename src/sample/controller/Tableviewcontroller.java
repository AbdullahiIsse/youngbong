package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import sample.Controller;

import java.awt.*;

public class Tableviewcontroller
{
  private Region root;
  private ModelInterface model;
  private Controller viewhandler;
  private DataObject nowdataObject;

  @FXML private TextField NameInput;
  @FXML private TextField TeleInput;
  @FXML private TextField RoleInput;

  public void init(Controller viewhandler, ModelInterface model, Region root){
    this.model=model;
    this.root=root;
    this.viewhandler=viewhandler;
  }
  public void submit()
  {
    String Name = NameInput.getText();
    String Rolle = RoleInput.getText();
    int Teleinput = Integer.parseInt(TeleInput.getText());
    if (nowdataObject == null)
    {
      DataObject dataObject = new DataObject(Name, Teleinput, Rolle);
      model.addDataObject(dataObject);
    }
    else
    {
      nowdataObject.setName(Name);
      nowdataObject.setTele(Teleinput);
      nowdataObject.setRolle(Rolle);
    }
  }
}

