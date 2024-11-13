package SlushIceButik;

import java.util.ArrayList;

public class SlushIceAutomat {
    private String name;
    private final ArrayList<SlushIce> VARIANT;

    public SlushIceAutomat() {
        VARIANT = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SlushIce> getVARIANT() {
        return VARIANT;
    }

    public void addFlavor(String flavorName, double price) {
        SlushIce flavor = new SlushIce(flavorName, price);
        VARIANT.add(flavor);
    }

    public double buyFlavour(String flavorName, double price){
        for (SlushIce s : getVARIANT()){
            if(s.getVARIANT().contains(flavorName) && s.getPRICE() < price){
                return s.getPRICE();
            }
        }
        return 0;
    }

    public void deleteFlavor(String flavorName) {
        SlushIce slush = null;
        for (SlushIce s : getVARIANT()) {
            if (s.getVARIANT().toLowerCase().contains(flavorName.toLowerCase())) {
                slush = s;
            }
        }
        VARIANT.remove(slush);
    }

    public int amountOfVariants() {
        return VARIANT.size();
    }

    public String printFlavours() {
        StringBuilder shop = new StringBuilder();

        shop.append(name).append("\n");
        shop.append("The shop got this many flavours: ")
                .append(amountOfVariants())
                .append("\n");

        for (SlushIce flavour : VARIANT) {
            shop.append("navn: ").append(flavour.toString()).append("\n");
            shop.append("pris: ").append(flavour.getPRICE()).append("\n");
        }

        return shop.toString();
    }
}
