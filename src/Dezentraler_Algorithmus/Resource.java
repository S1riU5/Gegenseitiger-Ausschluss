package Dezentraler_Algorithmus;

import static java.lang.Thread.sleep;

/**
 * Created by Simon on 05.12.2014.
 */

//TEst
public class Resource {

    private int value = 0;

    public void increment(){
        System.out.println("Resource erhöt");
        value++;
        System.out.println(value);
        try {
            sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

