package GifteOpgave;

public class Menneske {
    // opretter ægtefælle og navn
    private Menneske ægteFælle;
    private String navn;

    // sætter navnet på personen.
    public Menneske(String navn){
        this.navn = navn;
    }

    // Metoden returnere en string.
    // Indsætter ægtefælle objektet fra main. Ikke det globale
    public String gifterSigMed(Menneske ægteFælle){
        // indsætter ægtefælle i ægtefælle objektet.
        setÆgteFælle(ægteFælle);

        return !this.navn.equals(ægteFælle.navn)
                ? "De kan godt giftes."
                : "De kan ikke giftes";
    }

    // fjerne ægtefællen igen.
    public String bliverSkilt(Menneske ægteFælle){
        // Indsætter ægtefælle i tempÆgte og this.navn i tempThis.
        Menneske tempÆgte = this.ægteFælle;
        Menneske tempThis = this;
        // Sætter til null
        this.ægteFælle = null;
        ægteFælle.ægteFælle = null;

        // returnere denne string.
        return "bliver nu skilt fra " + tempÆgte.navn + " og " +
                tempÆgte.navn + " bliver skilt fra " + tempThis.navn;
    }

    private void setÆgteFælle(Menneske ægteFælle){
        this.ægteFælle = ægteFælle;
        ægteFælle.ægteFælle = this;
    }

    public Menneske getÆgteFælle(){
        return ægteFælle;
    }

    @Override
    public String toString(){
        return navn;
    }
}
