package Terningspil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        boolean roll1 = false;
        boolean roll2 = false;

        while(!roll1 && !roll2){
            terning1.roll();
            terning2.roll();

            System.out.println("roll1: " + terning1.getFaceValue());
            System.out.println("roll2: " + terning2.getFaceValue());

            roll1 = terning1.checkSnakeEyes();
            roll2 = terning2.checkSnakeEyes();
        }

        if(roll1){
            System.out.println("Snake eyes!! for player 1");
        }else{
            System.out.println("Snake eyes!! for player 2");
        }

    }
}
