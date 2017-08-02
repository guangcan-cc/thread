package cc.blog.practice.a;

/**
 * Created by Denny on 2017/8/2.
 */
public class A {
    public static void main(String[] args) throws InterruptedException {

        T1 t = new T1();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
//        t1.join();
        t2.start();
//        t2.join();
        t3.start();


    }

}
