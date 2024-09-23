package Lommeregner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        String stringTal1 = "2";
        String stringTal2 = "2";
        calculator.add(2,2);
        calculator.add(2.4,2.4);
        calculator.add(2,2,2);
        calculator.add(Integer.parseInt(stringTal1),
                Integer.parseInt(stringTal2));
        calculator.multiply(2.2,2.2);
        calculator.multiply(2,2);
        calculator.division(2,2);
    }
}
