package cc.blog.interrupt;

/**
 * Created by Denny on 2017/7/18.
 */
public class NotifyThread implements Runnable{

    private Object lock ;

    public  NotifyThread(Object lock){
        this.lock = lock ;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("开始唤醒线程...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.notify();

            lock.notifyAll();

            System.out.println("结束唤醒线程...");
        }
    }
}
