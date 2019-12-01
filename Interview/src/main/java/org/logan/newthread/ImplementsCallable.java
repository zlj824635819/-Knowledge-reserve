package org.logan.newthread;

import java.util.concurrent.Callable;

/**
 * @author logan
 * date 2019/12/1
 */
public class ImplementsCallable implements Callable {
    @Override
    public String call() {
        return "implements Callable 创建的线程";
    }
}
