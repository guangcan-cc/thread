package cc.blog.interrupt;

/**
 * Created by Denny on 2017/7/10.
 */
public class MyThread extends Thread {

    private Object lock;

    public MyThread(Object lock){
        this.lock = lock ;
    }

    @Override
    public void run() {
        synchronized (lock){
            for(int i = 0 ; i < 100000 ; i ++){
                System.out.println(Thread.currentThread().getName() + "正在执行...");
                if( i == 1){
                    try {
                        lock.wait(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
