package LampeOpgave;

public class Lampe{
    // false slukket og true tænd
    private boolean light;
    private static int antalLamper = 0;

    public Lampe(boolean light){
        this.light = light;
        setAntalLamper();
    }
    public Lampe(){
        light = false;
        setAntalLamper();
    }

    private void setAntalLamper(){
        antalLamper++;
    }

    public void trykPaaKontakt(){
        light = !light;
    }

    public boolean getLight(){
        return this.light;
    }

    public int getAntalLamper(){
        return antalLamper;
    }

    @Override
    public String toString(){
        return light ? "lampen er tændt" : "Lampen er ikke tændt";
    }
}
