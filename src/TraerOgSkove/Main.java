package TraerOgSkove;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.addTree(7000);
        forest.addTree(1);
        forest.addTree(3);
        forest.addTree(4);

        forest.growOneYear();

        System.out.println(forest);

    }
}
