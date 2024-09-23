package BilChauffør;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> biler;

    public Garage(){
        biler = new ArrayList<>();
    }

    public void tilføjBil(Bil bil){
        biler.add(bil);
    }

    public double beregnPrisForAlleBiler(){
        double pris = 0;

        var wrapper = new Object() { double pris = 0; };

        biler.forEach(item -> wrapper.pris += (double)item.getNyPris());

        for (Bil bil : biler){
            pris += bil.getNyPris();
        }
        return wrapper.pris;
    }
}
