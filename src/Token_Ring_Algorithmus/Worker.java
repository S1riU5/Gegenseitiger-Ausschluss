package Token_Ring_Algorithmus;

/**
 * Created by Simon on 06.12.2014.
 */
public class Worker extends Thread implements IWorker,Runnable {
    private int id;
    private Worker nextWorker;
    private Resource resource;
    private boolean haveToken = false;

    public Worker(){

    }

    @Override
    public void sendToken() {
        nextWorker.reciveToken(haveToken);
        haveToken = false;
    }

    @Override
    public void haveToken() {
        System.out.println("Prozess " + id + " hat token ? " + haveToken );
    }

    @Override
    public void reciveToken(boolean token) {
        haveToken = token;
    }

    @Override
    public void doTask() {
        resource.increment();
    }

    @Override
    public void setID(int id){
        this.id = id;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setNextWorker(Worker worker) {
        nextWorker = worker;
    }


    @Override
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void printRelationship(){
        System.out.println("Prozess: " + id + " Nachbar: " + nextWorker.getID() );
    }

    @Override
    public void run(){
        while (true){
            if(haveToken){
                haveToken();
                doTask();
                sendToken();

            }else{
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
