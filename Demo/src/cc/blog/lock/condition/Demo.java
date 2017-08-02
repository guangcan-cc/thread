package cc.blog.lock.condition;

/**
 * Created by Denny on 2017/7/20.
 */
public class Demo {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA threadA = new ThreadA(service);
        threadA.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        service.signal();
    }
}
