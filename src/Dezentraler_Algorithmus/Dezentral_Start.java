package Dezentraler_Algorithmus;

import java.util.List;

/**
 * Created by Simon on 08.12.2014.
 */
public class Dezentral_Start {

    public static void main(String[] args) {
        Resource resource = new Resource();
        List<Coordinator> cList = Coordinator_Factory.createCoordintorList(5);
        List<Worker> wList = Worker_Factory.createWorker(15,cList,resource) ;
        InitAlgorithm.init(wList,cList);





    }
}
