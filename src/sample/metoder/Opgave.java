package sample.metoder;

public class Opgave
{
  private String Opgavetekst,Skøn,Status,prioriteringsniveau;
  private int Estimat;

  public Opgave(String opgavetekst, String skøn, String status,
      String prioriteringsniveau, int estimat)
  {
    Opgavetekst = opgavetekst;
    Skøn = skøn;
    Status = status;
    this.prioriteringsniveau = prioriteringsniveau;
    Estimat = estimat;
  }
}
