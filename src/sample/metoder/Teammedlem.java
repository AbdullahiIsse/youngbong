package sample.metoder;

public class Teammedlem
{
  private String Fornavn,Efternavn,Rolle;
  private int Telefonnummer,TeammedlemId;

  public Teammedlem(String fornavn, String efternavn, String rolle,
      int telefonnummer, int teammedlemId)
  {
    Fornavn = fornavn;
    Efternavn = efternavn;
    Rolle = rolle;
    Telefonnummer = telefonnummer;
    TeammedlemId = teammedlemId;
  }

  public String getFornavn() {
    return Fornavn;
  }

  public void setFornavn(String fornavn) {
    Fornavn = fornavn;
  }

  public String getEfternavn(String newValue) {
    return Efternavn;
  }

  public void setEfternavn(String efternavn) {
    Efternavn = efternavn;
  }

  public String getRolle(String newValue) {
    return Rolle;
  }

  public void setRolle(String rolle) {
    Rolle = rolle;
  }

  public int getTelefonnummer() {
    return Telefonnummer;
  }

  public void setTelefonnummer(int telefonnummer) {
    Telefonnummer = telefonnummer;
  }

  public int getTeammedlemId() {
    return TeammedlemId;
  }

  public void setTeammedlemId(int teammedlemId) {
    TeammedlemId = teammedlemId;
  }
}