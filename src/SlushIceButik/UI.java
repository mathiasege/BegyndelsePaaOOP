package SlushIceButik;

import java.util.Scanner;

public class UI {

    public void automat() {
        SlushIceAutomat slushIceAutomat = new SlushIceAutomat();
        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        System.out.println("Hvad hedder automaten");
        slushIceAutomat.setName(scanInt.nextLine());
        System.out.println("Hvor mange penge har du?");
        double money = scanInt.nextDouble();

        while (true) {
            System.out.println("Køb noget hos:");

            System.out.println(slushIceAutomat.printFlavours());

            System.out.println("Tilføj smag tast 1");
            System.out.println("Fjern smag tast 2");
            System.out.println("Tæl varianter 3");
            System.out.println("Køb is 4");

            int input = scanInt.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("Hvad hedder smagen?");
                    String flaveName = scanString.nextLine();
                    System.out.println("Hvad koster den");
                    double price = scanInt.nextDouble();

                    slushIceAutomat.addFlavor(flaveName,price);

                }
                case 2 -> {
                    System.out.println("Hvad hedder smagen?");
                    slushIceAutomat.deleteFlavor(scanString.nextLine());
                }
                case 3 -> System.out.println("antal: " + slushIceAutomat.amountOfVariants());
                case 4 -> {
                    System.out.println("Hvilken is vil du købe?");
                    String flavor = scanString.nextLine();
                    double result = slushIceAutomat.buyFlavour(flavor,money);

                    if(result > 0){
                        System.out.println("Du købte isen");
                        money -= result;
                        System.out.println("Dine penge: " + money);
                    }else {
                        System.out.println("Du har ikke råd");
                    }
                }
                default -> System.out.println("Forkert indtastet.");

            }
        }
    }
}
