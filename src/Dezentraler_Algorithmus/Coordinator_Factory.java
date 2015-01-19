package Dezentraler_Algorithmus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Simon on 08.12.2014.
 */
public class Coordinator_Factory {

    private  Coordinator_Factory(){

    }

    public static List<Coordinator> createCoordintorList(int c){
        List<Coordinator> cList = new ArrayList<Coordinator>();

        for (int i = 0; i < c ; i++) {
            cList.add(new Coordinator(i));
        }

        return cList;

    }
}
