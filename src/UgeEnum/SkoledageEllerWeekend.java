package UgeEnum;

import java.util.Scanner;

public class SkoledageEllerWeekend {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvilken dag er det?");
        for(int i = 0; i < UgeDag.values().length; i++){
            System.out.println(i+1 + ": " + UgeDag.values()[i]);
        }

        System.out.println("Vælg en ugedag.");
        int brugerValg = scan.nextInt();

        while (brugerValg > 7 || brugerValg < 0){
            System.out.println("Dette er ikke et gyldigt valg. Tast igen");
            brugerValg = scan.nextInt();
        }

        UgeDag dag = UgeDag.values()[brugerValg-1];

        System.out.println(dag);

//        String result = switch (dag){
//            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Det er hverdag!";
//            case SATURDAY, SUNDAY -> "Det er weekend!";
//        };

        String result = "";

        switch (dag){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                String temp = "";

                if(UgeDag.MONDAY == dag) {
                    temp = "Det er mandag igen…";
                }
                if(UgeDag.FRIDAY == dag){
                    temp = "Men du har weekend når du har fri!";
                }
                result = "Du skal i skole. " + temp;
            }
            case SATURDAY, SUNDAY -> result = "Det er weekend, bare sov videre…";
        };

        System.out.println(result);
    }
}
