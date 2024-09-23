package Digitalur;

public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);

        timeTick();
    }

    public void timeTick(){
        minutes.valueIncrement();
        if(minutes.getValue() == 0){
            hours.setValue(1);
        }
        updateDisplay();
    }

    public String displayValue(){
        return displayString;
    }

    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
