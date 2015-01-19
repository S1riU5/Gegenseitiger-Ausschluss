package Dezentraler_Algorithmus;

import java.util.List;

/**
 * Created by Simon on 08.12.2014.
 */
public class InitAlgorithm {


    public static void init(List<Worker> wList, List<Coordinator> cList){

        for (int i = 0; i < wList.size() ; i++) {
            new Thread(wList.get(i)).start();
        }


    }

}
