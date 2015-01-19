package Zentraler_Algorithmus;



/**
 * Created by Simon on 05.12.2014.
 */
public class Zentral_Starrt {
    public static void main(String[] args) {
        Coordinator c = new Coordinator();
        Ressource r = new Ressource();
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Erzeugter Worker: " + i);
            new Thread(new Worker(i,r,c));
            //new Worker(i,r,c);
        }
    }

}
