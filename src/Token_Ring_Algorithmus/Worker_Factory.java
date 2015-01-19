package Token_Ring_Algorithmus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Simon on 08.12.2014.
 */
public class Worker_Factory {
    private static List<IWorker> wlist = new ArrayList<IWorker>();
    private Worker_Factory(){
    }

    public static List<IWorker> initTokenRing(){
        for (int i = 0; i < 10; i++) {

            wlist.add(new Worker());
            wlist.get(i).setID(i);
        }
        for (int i = 0; i < 10; i++){
            if (i == 9){
                wlist.get(i).setNextWorker((Worker) wlist.get( 0 ));
            }else{
                wlist.get(i).setNextWorker((Worker) wlist.get( i + 1 ));
            }

        }
        return wlist;
    }


}
