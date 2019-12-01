package org.logan.newthread;

/**
 * @author logan
 * date 2019/12/1
 */
public class ExtendThread extends Thread{
    @Override
    public void run(){
        System.out.println("extend Thread 创建的线程");
    }
}
