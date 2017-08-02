package cc.blog.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Denny on 2017/7/20.
 */
public class LockService {

    private Lock lock = new ReentrantLock();

    public void testMethod(){
        lock.lock();

        for(int i = 0; i < 20; i++){
            System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i+1)));
        }

        lock.unlock();
    }
}
