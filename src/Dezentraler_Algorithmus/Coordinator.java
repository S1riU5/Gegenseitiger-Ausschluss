package Dezentraler_Algorithmus;

/**
 * Created by Simon on 08.12.2014.
 */
public class Coordinator implements Runnable{

    private int id;
    private  boolean ressourceInUse = false;


    public Coordinator(int id){
        this.id = id;
    }



    public void releaseRessource(){
        ressourceInUse = false;
    }

    public  boolean askForPermission(){
        return !ressourceInUse;
    }

    @Override
    public void run() {
        while(true){}
    }
}
