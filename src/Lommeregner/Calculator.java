package Lommeregner;

public class Calculator{
    public void add(double decimalTal1, double decimalTal2){
        double result = decimalTal1 + decimalTal2;
        System.out.println("Addition of two integers: " + decimalTal1 + " + " + decimalTal1 + " = " + result);
    }
    public void add(double decimalTal1, int helTal1){
        double result = decimalTal1 + helTal1;
        System.out.println("Addition of two integers: " + decimalTal1 + " + " + helTal1 + " = " + result);
    }

    public void add(int tal1, int tal2){
        int result = tal1 + tal2;
        System.out.println("Addition of two integers: " + tal1 + " + " + tal2 + " = " + result);
    }

    public void add(int tal1, int tal2, int tal3){
        int result = tal1 + tal2 + tal3;
        System.out.println("Addition of two integers: " + tal1 + " + " + tal2 + " + " + tal3 + " = " + result);
    }

    public void multiply(int helTal1, int helTal2){
        int result = helTal1 * helTal2;
        System.out.println("Multiply of two integers: " + helTal1 + " + " + helTal2 + " = " + result);
    }

    public void multiply(double decimalTal1, double decimalTal2){
        double result = decimalTal1 * decimalTal2;
        System.out.println("Multiply of two doubles: " + decimalTal1 + " + " + decimalTal2 + " = " + result);
    }

    public void division(int tal1, int tal2){
        double result = tal1/tal2;
        System.out.println("Division of integers: " + tal1 + " / " + tal2 + " = " + result);
    }
}
