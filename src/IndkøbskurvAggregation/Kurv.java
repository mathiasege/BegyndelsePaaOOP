package IndkøbskurvAggregation;

import java.util.ArrayList;

public class Kurv {
    private ArrayList<Ordrelinje> ordre = new ArrayList<>();

    public Kurv(ArrayList<Ordrelinje> ordre){
        this.ordre.addAll(ordre);
    }

    public double bonPris(){
        double samletPris = 0;

        for(Ordrelinje item : ordre){
            samletPris += item.samletPris();
        }
        return samletPris;
    }

    @Override
    public String toString(){
        String varerNavn = "";
        for(Ordrelinje item : ordre){
            varerNavn += item + " \n";
        }

        return varerNavn;
    }
}
