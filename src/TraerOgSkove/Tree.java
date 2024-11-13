package TraerOgSkove;

public class Tree {
    private final int age;
    private double height;
    private final double growPct;

    public Tree(double growPct){
        this.age = 1;
        this.height = 0.25;
        this.growPct = growPct;
    }

    public void growOneYear(){
        double grow = height*(1+growPct/100);

        height = grow <  20 ? grow : height;
    }



    @Override
    public String toString(){
        return "age: " + age + " height: " + height;
    }
}
