package Semaphore;

import static java.lang.Thread.sleep;

/**
 * Created by Simon on 05.12.2014.
 */
//TEst
public class WarteThread extends Thread implements Runnable {

    private Semaphore semaphore;
    private final int id;

    public WarteThread(Semaphore semaphore, int id){
        this.semaphore = semaphore;
        this.id = id;
        start();

    }




    @Override
    public void run() {

            semaphore.ask();
            System.out.println("Kritischer Bereich wird betreten von Thread: " + id);
            try{
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread: " + id + " verlässt kritischen Bereich.");
            semaphore.leave();

    }
}
