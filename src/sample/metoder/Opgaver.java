package sample.metoder;

public class Opgaver {
    private String opgavetekst;
    private String krav;
    private int estimat;
    private String prioritetsniveau;

    public Opgaver(String opgavetekst, String krav, int estimat, String prioritetsniveau) {
        this.opgavetekst = opgavetekst;
        this.krav = krav;
        this.estimat = estimat;
        this.prioritetsniveau = prioritetsniveau;
    }

    public String getOpgavetekst() {
        return opgavetekst;
    }

    public void setOpgavetekst(String opgavetekst) {
        this.opgavetekst = opgavetekst;
    }

    public String getKrav() {
        return krav;
    }

    public void setKrav(String krav) {
        this.krav = krav;
    }

    public int getEstimat() {
        return estimat;
    }

    public void setEstimat(int estimat) {
        this.estimat = estimat;
    }

    public String getPrioritetsniveau() {
        return prioritetsniveau;
    }

    public void setPrioritetsniveau(String prioritetsniveau) {
        this.prioritetsniveau = prioritetsniveau;
    }
}
