package BilletAutomat;

public class Billetautomat {
    private int pris;
    private int saldo;
    private int total;

    public Billetautomat(int billetPris){
        saldo = 0;
        total = 0;
        pris = billetPris;
    }

    public int getPris(){
        return pris;
    }

    public int getSaldo(){
        return saldo;
    }

    public void indBetal(int kroner){
        if(kroner > 0){
            saldo += kroner;
        }
        else{
            System.out.println("Man skal indsætte et postivt beløb, der er større end 0. Din værdi: " + kroner + " værdi.");
        }
    }

    public void printBillet(){
        if(saldo >= pris){
            System.out.println("########################");
            System.out.println("### Linje F(antasi) ###");
            System.out.println("########################");
            System.out.println("## Billet: " + pris + " kr. ##");
            System.out.println();

            total = total + saldo;
            saldo = 0;
        }else {
            System.out.println("Du kan ikke købe en billet.");
            System.out.println("Du mangler at indbetale: " + (pris-saldo));
        }
    }


}
