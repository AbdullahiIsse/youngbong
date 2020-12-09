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
}