package org.logan.discontinuity;

/**
 * @author logan
 * date 2019/12/3
 */
public class Interrupted extends Thread{
    @Override
    public void run(){
        while (!interrupted()) {
            System.out.println("被暂停");
        }
        System.out.println("Thread end");
    }
}
