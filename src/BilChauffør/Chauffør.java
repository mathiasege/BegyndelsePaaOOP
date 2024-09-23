package BilChauffør;

public class Chauffør {
    private String navn;

    public Chauffør(String navn){
        this.navn = navn;
    }

    @Override
    public String toString(){
        return navn;
    }
}
