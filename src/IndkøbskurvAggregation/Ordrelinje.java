package IndkøbskurvAggregation;

public class Ordrelinje {
    private Vare vare;
    private int antal;

    public Ordrelinje(Vare vare, int antal){
        this.vare = vare;
        this.antal = antal;
    }

    public double samletPris(){
        return vare.getPris() * antal;
    }

    @Override
    public String toString(){
        return vare + " antal: " + antal;
    }
}
