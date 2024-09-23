package SøgStuderende;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Studerende mads = new Studerende("Mads", "mads@test.dk");
        Studerende emil = new Studerende("Emil", "emil@test.dk");
        Studerende niklas = new Studerende("Niklas", "niklas@test.dk");

        Klasse klasse = new Klasse();

        klasse.setStuderende(mads);
        klasse.setStuderende(emil);
        klasse.setStuderende(niklas);

        Scanner scan = new Scanner(System.in);

        System.out.println("Hvilken studerende søger du?");
        String input = scan.nextLine();

        Studerende student = klasse.getStudent(input);

        System.out.println(student != null ? student : "Findes ikke.");

        System.out.println("Hvad vil du gerne ændre?");
        System.out.println("1. for navn");
        System.out.println("2. for email");
        Studerende temp = student;
        if(scan.nextInt() == 1) {
            System.out.println("Skriv navn.");
            student.setNavn(new Scanner(System.in).nextLine());
        }else{
            System.out.println("Skriv email");
            student.setEmail(new Scanner(System.in).nextLine());
        }

        klasse.redigerStuderende(temp,student);

        System.out.println(klasse);

    }


}
