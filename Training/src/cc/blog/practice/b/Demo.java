package cc.blog.practice.b;

/**
 * Created by Denny on 2017/8/2.
 */
public class Demo {
    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();

        Thread thread = new Thread(threadA);

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
