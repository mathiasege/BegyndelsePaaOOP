package LinkedinOpgave;

public class Calculate {
    public static double calculateTotalMealPrice(double listedPrice,double tipRate, double taxRate){
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        return listedPrice + tip + tax;
    }

    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealCost);

        double individualTotalMealCost = groupTotalMealCost / 5;
        System.out.println(individualTotalMealCost);

        double result = Math.pow(2,5);
        System.out.println(result);
    }
}
