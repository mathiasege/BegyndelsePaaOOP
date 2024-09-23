package Firkant;

public class Firkant {
    double sideLaengde;
    double hoejde;

    public Firkant(double sideLaengde, double hoejde){
        this.sideLaengde = sideLaengde;
        this.hoejde = hoejde;
    }

    public double beregnAreal(){
        return sideLaengde*hoejde;
    }

    public String hvilkenSlagsFirkant(){
        if(sideLaengde == hoejde)
            return "Det er et kvadrat";
        else
            return "Det er en rektangel";
    }
}
