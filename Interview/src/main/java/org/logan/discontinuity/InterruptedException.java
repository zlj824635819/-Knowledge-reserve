package org.logan.discontinuity;

/**
 * @author logan
 * date 2019/12/3
 */
public class InterruptedException extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(2000);
            System.out.println("Thread run");
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}
