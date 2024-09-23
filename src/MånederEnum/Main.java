package MånederEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hvilken dag er det?");

        int count = 0;
        for(Month month : Month.values()){
            count++;
            System.out.println(count + ": " + month);
        }

        for(int i = 0; i < Month.values().length; i++){
            System.out.println(i+1 + ": " + Month.values()[i]);
        }

        System.out.println("Vælg en måned.");
        int brugerValg = scan.nextInt();

        while (brugerValg > 12 || brugerValg < 0){
            System.out.println("Dette er ikke en gyldig valg. Tast igen");
            brugerValg = scan.nextInt();
        }

        Month month = Month.values()[brugerValg-1];


        String result = switch (month){
            case JAUNAR, FEBRUAR, MARTS -> "Det er forår!";
            case APRIL, MAJ, JUNI -> "Det er sommer!";
            case JULI, AUGUST, SEPTEMPER -> "Det er efterår!";
            case OKTOBER, NOVEMBER, DECEMBER -> "Det vinter";
        };

        System.out.println(result);
    }
}
