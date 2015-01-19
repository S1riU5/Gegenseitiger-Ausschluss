package Semaphore;

import java.util.concurrent.*;

/**
 * Created by Simon on 05.12.2014.
 */
//TEst
public class StartSemphore {
    public static void main(String[] args) {
        ThreadFactory.creatThread(SemaphorFactory.createSemaphore(), 20);
    }
}
