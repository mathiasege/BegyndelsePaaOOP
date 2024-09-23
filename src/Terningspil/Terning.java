package Terningspil;

import java.util.Random;

public class Terning {
    private final int MAX = 7;
    private int faceValue;
    Random rand = new Random();
    private int previousRoll = 0;

    public Terning(){ }

    public void roll(){
        faceValue = rand.nextInt(1, MAX);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public boolean checkSnakeEyes(){
        if(faceValue == previousRoll && faceValue == 1){
            return true;
        }else{
            previousRoll = faceValue;
            return false;
        }
    }
}
