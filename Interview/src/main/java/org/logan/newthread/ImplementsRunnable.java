package org.logan.newthread;

/**
 * @author logan
 * date 2019/12/1
 */
public class ImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("implements Runable 创建的线程");
    }
}
