package TraerOgSkove;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> allTree;

    public Forest(){
        allTree = new ArrayList<>();
    }

    public void addTree(int growthPct){
        Tree tree = new Tree(growthPct);

        allTree.add(tree);
    }

    public void growOneYear(){
        for (Tree tree : allTree){
            tree.growOneYear();
        }
    }

    @Override
    public String toString(){
        StringBuilder trees = new StringBuilder();
        trees.append("Forest:").append("\n");

        for (Tree tree : allTree){
            trees.append(tree.toString()).append("\n");
        }
        return trees.toString();
    }
}
