package BilChauffør;

public class Main {
    public static void main(String[] args) {

//        Chauffør bertram = new Chauffør("Bertram");
//        Chauffør mathias = new Chauffør("Mathias");

        Bil bil1 = new Bil("Rød", 100, 199.95);
        Bil bil2 = new Bil("Grøn", 200, 100);
        Garage g = new Garage();

        g.tilføjBil(bil1);
        g.tilføjBil(bil2);



        System.out.println(g.beregnPrisForAlleBiler());


//        System.out.println(bil);
//
//        bil.setChauffør(bertram);
//
//        System.out.println(bil.getChauffør());
//
//        boolean kanVæreDer = bil.enChaufførSætterSigInd(mathias);
//
//        System.out.println(kanVæreDer);
//
//        System.out.println(bil.getChauffør());
//
//        System.out.println("Hvem kører bilen: " + bil.hvemKørerBilen());
//
//        System.out.println("Stiger ud af bilen " + bil.chaufførenStigerUd());
    }
}
