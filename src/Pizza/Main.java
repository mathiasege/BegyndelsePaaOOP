package Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vælg et nummer fra følgende menu.");
        System.out.println("1. Margherita");
        System.out.println("2. Vesuvio");
        System.out.println("3. Hawaii");
        System.out.println("4. Pepperoni");

        int userChoice = input.nextInt();
        switch (userChoice){
            case 1 -> System.out.println("Du har valgt Magaritha");
            case 2 -> System.out.println("Du har valgt Vesuvio");
            case 3 -> System.out.println("Du har valgt Hawaii");
            case 4 -> System.out.println("Du har valgt Pepperoni");
            default -> System.out.println("Du har ikke valgt en pizza fra menuen");
        }
    }
}
