package sample.controller;

import java.io.Serializable;

public class DataObject implements Serializable{
  private String Name;
  private int Tele;
  private String Rolle;

  public DataObject(String name, int tele, String rolle)
  {
    Name = name;
    Tele = tele;
    Rolle = rolle;
  }

  public String getName()
  {
    return Name;
  }

  public void setName(String name)
  {
    Name = name;
  }

  public int getTele()
  {
    return Tele;
  }

  public void setTele(int tele)
  {
    Tele = tele;
  }

  public String getRolle()
  {
    return Rolle;
  }

  public void setRolle(String rolle)
  {
    Rolle = rolle;
  }
}
