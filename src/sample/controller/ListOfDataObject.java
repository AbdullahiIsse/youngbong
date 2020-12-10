package sample.controller;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListOfDataObject
{
  private ArrayList<DataObject> list;

  public ListOfDataObject(){list=new ArrayList<>();}

  public void addDataObject(DataObject dataObject){list.add(dataObject);}

  public void removeDataObject(DataObject dataObject){list.remove(dataObject);}

  public DataObject getDataObjecktByName(String Name)
  {
    for (DataObject dataObject:list)
    {
      if (dataObject.getName().equals(Name))
        return dataObject;
    }
    throw new NoSuchElementException("Prøv igen" + Name + "dette var fundet" );
  }
  public ArrayList<DataObject>getAllDataobjects(){return list;}
}
