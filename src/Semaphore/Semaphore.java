package Semaphore;

/**
 * Created by Simon on 05.12.2014.
 */
//TEst
public class Semaphore {

    private int value;

    public Semaphore(int init){
        if (init < 0){
            throw new IllegalArgumentException("Initialisierung < 0");
        }
        value = init;
    }

    public synchronized void ask() {
        while (value == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value--;
    }

    public synchronized void leave(){
            value++;
        notifyAll();
    }
}
