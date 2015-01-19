package Token_Ring_Algorithmus;

import java.util.List;

/**
 * Created by Simon on 08.12.2014.
 */
public class Token_Start {

    public static void main(String[] args) {
        List<IWorker> wlist = Worker_Factory.initTokenRing();
        Resource r = new Resource();
        wlist.get(0).reciveToken(true);

        for (int i = 0; i <10; i++) {
            wlist.get(i).setResource(r);
        }

        Thread t1 = new Thread((Runnable) wlist.get(0));
        Thread t2 = new Thread((Runnable) wlist.get(1));
        Thread t3 = new Thread((Runnable) wlist.get(2));
        Thread t4 = new Thread((Runnable) wlist.get(3));
        Thread t5 = new Thread((Runnable) wlist.get(4));
        Thread t6 = new Thread((Runnable) wlist.get(5));
        Thread t7 = new Thread((Runnable) wlist.get(6));
        Thread t8 = new Thread((Runnable) wlist.get(7));
        Thread t9 = new Thread((Runnable) wlist.get(8));
        Thread t10 = new Thread((Runnable) wlist.get(9));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
