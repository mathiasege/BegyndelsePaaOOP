package BankKonto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // -------------- uden parameter -------------------
//        Konto kontoUdenParameter = new Konto();
//        System.out.println("Hvad hedder ejeren?");
//        kontoUdenParameter.setEjerNavn(scan.nextLine());
//        System.out.println("Ejerens navn: " + kontoUdenParameter.getEjerNavn());
//
//        System.out.println("Opret en konto");
//        kontoUdenParameter.setKonto(scan.nextLine());
//        System.out.println("Konto: " + kontoUdenParameter.getKonto());
//
//        System.out.println("Hvor meget står der på din konto");
//        kontoUdenParameter.setSaldo(scan.nextInt());
//
//        System.out.println("hvor meget vil du hæve?");
//        int getMoney = kontoUdenParameter.getMoney(scan.nextInt());
        // ------------------------------------------

        // sæt ikke argument saldo
//        Konto kontoKunSaldo = new Konto("Mathias", "000-0000-000");
//
//        System.out.println("Hvor meget står der på din konto");
//        kontoKunSaldo.setSaldo(scan.nextInt());
//
//        System.out.println("hvor meget vil du hæve?");
//        int getMoney = kontoKunSaldo.getMoney(scan.nextInt());

        // ------------------------------------------

        // kun gennem argumenter
        Konto kontoKunArgumenter = new Konto("Mathias", "000-0000", 200);

        System.out.println("hvor meget vil du hæve?");
        System.out.println("Der står på din konto: " + kontoKunArgumenter.getSaldo());
        int getMoney = kontoKunArgumenter.getMoney(scan.nextInt());

        // ------------------------------------------

        if(getMoney == -1){
            System.out.println("Du har ikke nok penge");
        }else{
            System.out.println("Du har penge tilbage:");
            System.out.printf(String.valueOf(kontoKunArgumenter.getSaldo()));
        }


    }
}
