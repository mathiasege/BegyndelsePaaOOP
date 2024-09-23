package IndkøbskurvAggregation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vare mælk = new Vare("Mælk", 11);
        Vare sukker = new Vare("Sukker", 22);

        Ordrelinje ordreMælk = new Ordrelinje(mælk, 3);
        Ordrelinje ordreSukker = new Ordrelinje(sukker, 4);

        ArrayList<Ordrelinje> samletOrdre = new ArrayList<>();
        samletOrdre.add(ordreMælk);
        samletOrdre.add(ordreSukker);

        Kurv bon = new Kurv(samletOrdre);

        System.out.println(bon);
        System.out.println("i alt: " + bon.bonPris());
    }
}
