package sample.controller;

import java.util.ArrayList;

public class Model implements ModelInterface
{
  private ListOfDataObject listOfDataObject;

  public Model()
  {
    listOfDataObject = new ListOfDataObject();
    listOfDataObject
        .addDataObject(new DataObject("Mark", 51408516, "Scrummaster"));
    listOfDataObject.addDataObject(new DataObject("Amer", 12345678, "Kunde"));
  }

  @Override public ArrayList<DataObject> getAllDataObjects()
  {
    return listOfDataObject.getAllDataobjects();
  }

  @Override public DataObject getDataObjectByName(String attribute1)
  {
    return listOfDataObject.getDataObjecktByName(attribute1);
  }

  @Override public void addDataObject(DataObject dataObject)
  {
    listOfDataObject.addDataObject(dataObject);
  }

  @Override public void save()
  {

  }
}

