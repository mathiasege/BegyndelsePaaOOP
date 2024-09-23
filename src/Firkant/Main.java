package Firkant;

public class Main {
    public static void main(String[] args) {
        Firkant firkantA = new Firkant(4.2, 3.5);
        double arealA = firkantA.beregnAreal();
        System.out.println("areal: " + arealA + " " + firkantA.hvilkenSlagsFirkant());

        Firkant firkantB = new Firkant(5.6, 5.6);
        double arealB = firkantB.beregnAreal();
        System.out.println("areal: " + arealB + " " + firkantB.hvilkenSlagsFirkant());
    }
}