package StenSaksPaPir;

public class ComputerPlayer extends Player{
    private Enum<Haandtegn> haandTegn;

    public ComputerPlayer(int point){
        super(point);
    }

    public void setHaandTegn(Enum<Haandtegn> haandTegn) {
        this.haandTegn = haandTegn;
    }
    public Enum<Haandtegn> getHaandTegn() {
        return haandTegn;
    }
}
