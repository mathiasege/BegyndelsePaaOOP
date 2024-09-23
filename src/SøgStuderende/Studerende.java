package SøgStuderende;

public class Studerende {
    private String navn;
    private String email;

    public Studerende(String navn, String email){
        this.navn = navn;
        this.email = email;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Navn: " + navn + " Email: " +email;
    }
}
