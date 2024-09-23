package IndkøbskurvAggregation;

public class Vare {
    private String navn;
    private double pris;

    public Vare(String navn, double pris){
        this.navn = navn;
        this.pris = pris;
    }

    public double getPris(){
        return pris;
    }

    @Override
    public String toString(){
        return navn + " pris: " + pris + " kr.";
    }
}
