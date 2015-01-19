package Dezentraler_Algorithmus;

import Token_Ring_Algorithmus.IWorker;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by Simon on 05.12.2014.
 */
//TEst
public class Worker implements Runnable {
    private int id;
    private int permissionCount = 0;
    private Resource resource;
    private List<Coordinator> cList;

    public Worker(int id, Resource resource, List<Coordinator> cList) {
        this.id = id;
        this.resource = resource;
        this.cList = cList;
    }

    public void releaseResource(){

        for (int i = 0; i < cList.size() ; i++) {
            cList.get(i).releaseRessource();
        }

    }


    public void  askForPermission() {



       /* do {
            permissionCount = 0;
            for (int i = 0; i <cList.size() ; i++) {
                if (cList.get(i).askForPermission()) {
                    permissionCount++;

                }
            }
            System.out.println("id "+ id +" size: " +cList.size()+ " PC: " + permissionCount);


        }while(permissionCount < cList.size()/2 );*/

        while (true) {
            for (int i = 0; i < cList.size(); i++) {
                if (cList.get(i).askForPermission()) {
                    permissionCount++;
                    try {
                        sleep((long) Math.random());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("PC: " + permissionCount +" Process " + id );
            if (permissionCount > cList.size() / 2) {
                System.out.println("Benutze Ressource: " + id);
                resource.increment();
                for (int i = 0; i < cList.size(); i++) {
                    cList.get(i).releaseRessource();
                }
                break;

            } else {
                System.out.println("Ressource abgeleht..: " + id);
                try {
                    sleep(permissionCount*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                permissionCount = 0;
            }
        }
    }

    @Override
    public void run(){

            askForPermission();

    }

}
