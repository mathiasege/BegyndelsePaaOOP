package Digitalur;

public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }

    // henter value
    public int getValue() {
        return value;
    }

    // Henter value.
    public String getDisplayValue(){
        // hvis value 10 er mindre end 0. Tilføj 0.
        if (value < 10){
            return "0" + value;
        }else{
            return String.valueOf(value);
        }
    }

    // Sætter værdien af value, hvis replacementValue er større eller ligmed 0
    // og replacementValue er mindre eller ligmed limit.
    public void setValue(int replacementValue){
        if(0 <= replacementValue && replacementValue <= limit){
            value += replacementValue;
        }
    }

    // value++. Hvis value er større end limit. Sæt value til rest værdien.
    public void valueIncrement(){
        value = ++value % limit;
    }
}
