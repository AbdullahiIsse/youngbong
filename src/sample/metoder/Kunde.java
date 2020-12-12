package sample.metoder;

public class Kunde
{
  private String Fornavn, Efternavn;
  private int Telefonnummer;

  public Kunde(String fornavn, String efternavn, int telefonnummer)
  {
    Fornavn = fornavn;
    Efternavn = efternavn;
    Telefonnummer = telefonnummer;
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
}
