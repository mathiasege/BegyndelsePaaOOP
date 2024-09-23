package BilletAutomat;

public class Main {
    public static void main(String[] args) {
        Billetautomat billetautomat = new Billetautomat(300);

        billetautomat.indBetal(400);

        System.out.println("saldo: " + billetautomat.getSaldo());
        System.out.println(billetautomat.getPris());

        billetautomat.printBillet();

        System.out.println("saldo: " + billetautomat.getSaldo());

    }
}
