package cc.blog.join.test;

/**
 * Created by Denny on 2017/7/20.
 */
public class ThreadB extends Thread {

    @Override
    synchronized public void run() {
        System.out.println(" b begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" b end");
    }
}
