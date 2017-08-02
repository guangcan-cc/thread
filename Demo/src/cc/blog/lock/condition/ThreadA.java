package cc.blog.lock.condition;

/**
 * Created by Denny on 2017/7/20.
 */
public class ThreadA extends Thread{
    private MyService service;

    public ThreadA (MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
