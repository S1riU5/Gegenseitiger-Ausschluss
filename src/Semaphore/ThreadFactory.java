package Semaphore;

/**
 * Created by Simon on 05.12.2014.
 */
//TEst
public class ThreadFactory {

    private ThreadFactory(){

    }

    public static void creatThread(Semaphore semaphore,int numthreads){
            for (int i=0; i<numthreads; i++){
                System.out.println("Created Thread: "+i);
                new WarteThread(semaphore,i);
            }
    }
}
