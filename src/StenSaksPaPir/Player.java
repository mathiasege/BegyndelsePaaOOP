package StenSaksPaPir;

public class Player {
    private int point;

    public Player(int point)
    {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void incrementPoint() {
        point++;
    }
}
