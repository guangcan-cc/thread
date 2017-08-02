package cc.blog.lock.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Denny on 2017/7/20.
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            lock.lock();
            System.out.println("进入wait()前..." + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("wait锁被释放了...");
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal()前..." + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
            System.out.println("signal锁被释放了...");
        }
    }
}
