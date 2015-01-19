package Zentraler_Algorithmus;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Simon on 05.12.2014.
 */
public class Coordinator {
    private LinkedBlockingQueue<Integer> que = new LinkedBlockingQueue<Integer>();
    private Boolean inUse = false;

    public synchronized void askForResource(int id) {
         do{
            if (!inUse) {
                System.out.println("Benutze resource Worker: #" + id);
                setInUse(true);
                break;
            } else {
            waitForResourc(id);

            }
        }while(!que.isEmpty());


    }

    private void waitForResourc(int id){
        que.add(id);
        try {
            wait();
            System.out.println("B: " + que);
            que.poll();
            System.out.println("A: " +que);
            System.out.println("Neue anfrage: " + id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void releaseResource(){
        System.out.println("Fertig mit resource");
        setInUse(false);
        notify();
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }
}