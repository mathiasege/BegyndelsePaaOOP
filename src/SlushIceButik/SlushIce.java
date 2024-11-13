package SlushIceButik;

public class SlushIce {
    private final String VARIANT;
    private final double PRICE;

    public SlushIce(String variant, double price) {
        VARIANT = variant;
        PRICE = price;
    }

    public String getVARIANT() {
        return VARIANT;
    }

    public double getPRICE() {
        return PRICE;
    }

    @Override
    public String toString(){
        return "Flavour: " + VARIANT + " Price: " + PRICE;
    }
}
