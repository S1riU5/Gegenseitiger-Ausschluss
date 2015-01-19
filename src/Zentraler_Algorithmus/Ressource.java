package Zentraler_Algorithmus;

import static java.lang.Thread.sleep;

/**
 * Created by Simon on 06.12.2014.
 */
public class Ressource {
    private int value = 0;

    public void increment() {
        System.out.println("Resource erhöt");
        value++;
        System.out.println(value);
        try {
            sleep((int) (Math.random() * 10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
