package cc.blog.join.test;

/**
 * Created by Denny on 2017/7/20.
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        b.join();
        System.out.println(" main end");
    }
}
