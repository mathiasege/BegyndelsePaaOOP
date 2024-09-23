package Person;

public class Person {
    String fornavn;
    String efternavn;
    double skorStr;

    Person(String fornavn, String efternavn, double skostroerrelse){
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.skorStr = skostroerrelse;
    }

    public void udskrivPerson(){
        System.out.println("Fornavn: " + fornavn +
                "\nefternavn: " + efternavn +
                "\nskostÃ¸rrelse: " + skorStr);
    }

    // overrider default metoden .toString(), som man nedarver.
    // Man skal have @Override. Kan man gøre på alle default metoder.
    @Override
    public String toString(){
        return "Fornavn: " + fornavn +
                "\nefternavn: " + efternavn +
                "\nskostÃ¸rrelse: " + skorStr;
    }

}
