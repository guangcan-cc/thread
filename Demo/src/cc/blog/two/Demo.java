package cc.blog.two;

/**
 * Created by Denny on 2017/7/10.
 */
public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread aThread = new Thread(myThread,"A");
        Thread bThread = new Thread(myThread,"B");
        Thread cThread = new Thread(myThread,"C");
        Thread dThread = new Thread(myThread,"D");
        aThread.start();
        bThread.start();
        cThread.start();
        dThread.start();
    }
}
