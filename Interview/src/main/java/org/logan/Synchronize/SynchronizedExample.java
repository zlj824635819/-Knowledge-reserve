package org.logan.Synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author logan
 * date 2019/12/3
 */
public class SynchronizedExample {
    private Lock lock = new ReentrantLock();
    public void fun1(){
        lock.lock();
        try{
            for (int i = 0; i < 10; i++) {

                System.out.print(i + " ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }finally {
            lock.unlock();
        }

    }
}
