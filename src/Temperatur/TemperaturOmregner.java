package Temperatur;

public class TemperaturOmregner {

    public static double fahrToCels(double fahr){
        return (fahr - 32)* 5/9;
    }

    public static double celsToFahr(double cels){
        return (cels*9/5)+32;
    }
}
