package LampeOpgave;

public class Main {
    public static void main(String[] args) {
        Lampe lampe1 = new Lampe();

        lampe1.trykPaaKontakt();

        System.out.println(lampe1.getLight());

        lampe1.trykPaaKontakt();

        System.out.println(lampe1.getLight());

        System.out.println(lampe1.getAntalLamper());

        Lampe lampe2 = new Lampe();
        System.out.println(lampe2.getAntalLamper());
        System.out.println(lampe2);
    }
}
