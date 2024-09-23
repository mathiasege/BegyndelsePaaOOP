package LinkedinOpgave;


import java.util.Scanner;

public class TeaTime {
    public static void announceTeaTime(){
        System.out.println("Wait for tea time...");
        System.out.println("Type in random word and press Enter to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("its tea time!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to yourr new job");
        announceTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");
        System.out.println("Learn stuff");

        announceTeaTime();

        System.out.println("Get promoted");
    }
}
