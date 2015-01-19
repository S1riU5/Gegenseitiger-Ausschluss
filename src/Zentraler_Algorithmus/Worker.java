package Zentraler_Algorithmus;



/**
 * Created by Simon on 05.12.2014.
 */
public class  Worker extends Thread implements Runnable  {

    private int id;
    private Ressource ressource;
    private Coordinator coordinator;
    public Worker(int id, Ressource ressource, Coordinator coordinator){
        this.ressource = ressource;
        this.id = id;
        this.coordinator = coordinator;
        start();
    }

    @Override
    public void run(){

        System.out.println("Frage nach Resource: " + id );
        try {
            sleep((int) (Math.random() * 10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        coordinator.askForResource(id);
        ressource.increment();
        coordinator.releaseResource();
    }
}
