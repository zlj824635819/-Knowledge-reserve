package org.logan;

import org.logan.newthread.ExtendThread;
import org.logan.newthread.ImplementsCallable;
import org.logan.newthread.ImplementsRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ImplementsRunnable i = new ImplementsRunnable();
        ExtendThread t = new ExtendThread();
        ImplementsCallable c = new ImplementsCallable();
        FutureTask ft = new FutureTask<>(c);
        Thread thread1 = new Thread(i);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(ft);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
