package BankKonto;

public class Konto {
    private String konto;
    private String ejerNavn;
    private int saldo;

    public int getMoney(int getAmount){
        if (saldo >= getAmount){
            return saldo -= getAmount;
        }
        else {
            return -1;
        }
    }

    public Konto(){

    }

    public Konto(String konto, String ejerNavn){
        this.konto = konto;
        this.ejerNavn = ejerNavn;
        this.saldo = 0;
    }

    public Konto(String konto, String ejerNavn, int saldo){
        this.konto = konto;
        this.ejerNavn = ejerNavn;
        this.saldo = saldo;
    }


        public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo += saldo;
    }

    public String getEjerNavn() {
        return ejerNavn;
    }

    public void setEjerNavn(String ejerNavn) {
        this.ejerNavn = ejerNavn;
    }

    public String getKonto() {
        return konto;
    }

    public void setKonto(String konto) {
        this.konto = konto;
    }
}
