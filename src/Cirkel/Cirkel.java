package Cirkel;

public class Cirkel {
    double radius;

    Cirkel(double radius){
        this.radius = radius;
    }

    public double beregnAreal(){
        return Math.pow(radius,2)*Math.PI;
    }
}
