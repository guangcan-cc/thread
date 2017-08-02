package cc.blog.interrupt;

/**
 * Created by Denny on 2017/7/10.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread myThread = new MyThread(lock);
        myThread.start();
        Thread.sleep(2000);

        NotifyThread notifyThread = new NotifyThread(lock);
        new Thread(notifyThread).start();
    }
}
