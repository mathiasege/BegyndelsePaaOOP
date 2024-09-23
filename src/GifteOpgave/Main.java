package GifteOpgave;

public class Main {
    public static void main(String[] args) {
        // Opretter 2 variabler, som skal blive ægtefæller
        Menneske mand = new Menneske("Mathias");
        Menneske kvinde = new Menneske("Amalie");

        // De giftes.
        //System.out.println(mand.gifterSigMed(kvinde));
        System.out.println(kvinde.gifterSigMed(mand));

        System.out.println("Nu man gift med:");
        System.out.println(mand + " er gift med ægtefælle: " + mand.getÆgteFælle() + ".");
        System.out.println(kvinde + " er gift med ægtefælle: " + kvinde.getÆgteFælle() + ".");

        // De bliver skilt.
        //System.out.println(mand + " " + mand.bliverSkilt(kvinde) + ".");
        System.out.println(kvinde + " " + kvinde.bliverSkilt(mand) + ".");

        // tjekker om de er null.
        System.out.println("Nu er man ikke gift");
        System.out.println("menneske ægtefælle: " + mand.getÆgteFælle() + ".");
        System.out.println("Ægtefælle ægtefælle: " + kvinde.getÆgteFælle() + ".");

    }
}
