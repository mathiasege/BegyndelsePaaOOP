package BilChauffør;


public class Bil {
    private String farve;
    private int antalKilomenter;
    private double nyPris;
    private Chauffør chauffør;

    public Bil(String farve, int antalKilomenter, double nyPris){
        this.farve = farve;
        this.antalKilomenter = antalKilomenter;
        this.nyPris = nyPris;
    }

    public void kør(int antalKilomenter){
        this.antalKilomenter += antalKilomenter;
    }

    public double getNyPris(){
        return nyPris;
    }

    public Chauffør getChauffør(){
        return chauffør;
    }

    public void setChauffør(Chauffør chauffør){
        this.chauffør = chauffør;
    }

    public boolean enChaufførSætterSigInd(Chauffør c){
        if(chauffør == null){
            setChauffør(c);
            return true;
        }else{
            return false;
        }
    }

    public Chauffør hvemKørerBilen(){
        return getChauffør();
    }

    // Crasher, hvis man returnere en null string.
    // vi har Override toString(). Derfor crasher det ikke. Vi slipper for if-else
    public Chauffør chaufførenStigerUd(){
        Chauffør c = chauffør;
        chauffør = null;
        return c;
    }

    @Override
    public String toString(){
        return "Bilen farve " + farve + ". Har kørt " + antalKilomenter + ". Den koster: " + nyPris;
    }
}
