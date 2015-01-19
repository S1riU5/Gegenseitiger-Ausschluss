package Dezentraler_Algorithmus;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Simon on 08.12.2014.
 */
public class Worker_Factory {

    public static List<Worker> createWorker (int numW,List<Coordinator> cList,Resource resource){
        List<Worker> wList = new ArrayList<Worker>();
        for (int i = 0; i <numW ; i++) {
            wList.add(new Worker(i,resource,cList));
        }
        return wList;

    }
}
