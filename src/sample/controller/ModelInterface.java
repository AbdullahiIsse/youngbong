package sample.controller;

import java.util.ArrayList;

public interface ModelInterface
{

    ArrayList<DataObject> getAllDataObjects();
    DataObject getDataObjectByName(String attribute1); //Not currently used in GUI
    void addDataObject(DataObject dataObject);
    void save();
}
