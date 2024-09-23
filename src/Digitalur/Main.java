package Digitalur;

public class Main {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();

        System.out.println(clockDisplay.displayValue());

        for(int i = 0; i < 122; i++) {
            clockDisplay.timeTick();

            System.out.println(clockDisplay.displayValue());
        }
    }
}
