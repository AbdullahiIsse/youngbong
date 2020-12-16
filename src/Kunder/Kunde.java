package Kunder;

public class Kunde
{
  private String Fornavn, Efternavn;
  private int Telefonnummer, kundeID;

  public Kunde(String fornavn, String efternavn, int telefonnummer,int kundeID)
  {
    Fornavn = fornavn;
    Efternavn = efternavn;
    Telefonnummer = telefonnummer;
    this.kundeID=kundeID;
  }

  public String getFornavn() {
    return Fornavn;
  }

  public void setFornavn(String fornavn) {
    Fornavn = fornavn;
  }

  public String getEfternavn() {
    return Efternavn;
  }

  public void setEfternavn(String efternavn) {
    Efternavn = efternavn;
  }

  public int getTelefonnummer() {
    return Telefonnummer;
  }

  public void setTelefonnummer(int telefonnummer) {
    Telefonnummer = telefonnummer;
  }

  public int getKundeID() { return kundeID;}

  public void setKundeID(int kundeID) {this.kundeID = kundeID;}

  @Override
  public String toString() {
    return "Kunde{" +
            "Fornavn='" + Fornavn + '\'' +
            ", Efternavn='" + Efternavn + '\'' +
            ", Telefonnummer=" + Telefonnummer +
            '}';
  }
}
