package cc.blog.practice.a;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Denny on 2017/8/2.
 */
public class T1 implements Runnable {

    private Lock readLock = new ReentrantReadWriteLock().readLock();

    @Override
    public void run() {
        readLock.lock();
        System.out.println(System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + "正在执行...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "执行结束...");
        readLock.unlock();
    }
}
