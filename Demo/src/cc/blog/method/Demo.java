package cc.blog.method;

/**
 * Created by Denny on 2017/7/10.
 */
public class Demo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin = " + myThread.isAlive());
        myThread.start();
        System.out.println("end = " + myThread.isAlive());
    }
}
