package cc.blog.join.test;

/**
 * Created by Denny on 2017/7/20.
 */
public class ThreadA extends Thread{

    private ThreadB b ;
    public ThreadA (ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b) {
            System.out.println(" a begin");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" a end");
        }
    }
}
