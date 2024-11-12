package StenSaksPaPir;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public void game() {
        // laver mine globale variabler
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        RealPlayer player = new RealPlayer(0);
        ComputerPlayer computer = new ComputerPlayer(0);
        final int POINT_FOR_AT_VINDE = 2;

        // Så længe, at points ikke er 2. Kør
        while (computer.getPoint() != POINT_FOR_AT_VINDE && player.getPoint() != POINT_FOR_AT_VINDE) {
            // bruger vælger
            System.out.println("vælg sten, saks eller papir");
            String input = scanner.nextLine().toLowerCase();

            // sætter computer sten, saks, papir.
            computer.setHaandTegn(Haandtegn.values()[rand.nextInt(0, 3)]);

            // udfra brugerinput og computerens input. gør noget
            if (input.equals("sten") && computer.getHaandTegn().name().equals("SAKS")) {
                player.incrementPoint();
                System.out.println("Du vandt. Fjenden fik: " + computer.getHaandTegn().name().toLowerCase());
            } else if (input.equals("saks") && computer.getHaandTegn().name().equals("PAPIR")) {
                player.incrementPoint();
                System.out.println("Du vandt. Fjenden fik: " + computer.getHaandTegn().name().toLowerCase());
            } else if (input.equals("papir") && computer.getHaandTegn().name().equals("STEN")) {
                player.incrementPoint();
                System.out.println("Du vandt. Fjenden fik: " + computer.getHaandTegn().name().toLowerCase());
            } else if (input.equalsIgnoreCase(computer.getHaandTegn().name())) {
                System.out.println("Det blev uafgjort. Fjenden fik: " + computer.getHaandTegn().name().toLowerCase());
                // søger i array og ser om de brugerinput matcher.
            } else if (Arrays.stream(Haandtegn.values())
                    .noneMatch(match -> match.name().equalsIgnoreCase(input.toUpperCase()))) {
                System.out.println("Ugyldigt input.");
            } else {
                computer.incrementPoint();
                System.out.println("Du tabte. fjenden fik: " + computer.getHaandTegn().name().toLowerCase());
            }

            // Skriver point
            System.out.println("Mine point: " + player.getPoint());
            System.out.println("Fjendens point " + computer.getPoint());
        }

        // skriv hvem der vinder.
        System.out.println("Vinder er: " + (computer.getPoint() == POINT_FOR_AT_VINDE ? "Computeren" : "Dig") + ".");
    }
}
