package GetSet;

public class Main {
    public static void main(String[] args) {
        GetSet getSet = new GetSet();

        getSet.setLength("Hej");
        System.out.println("length: " + getSet.getLength());

        getSet.setWidth(2.4);
        System.out.println("Width: " + getSet.getWidth());
    }
}
