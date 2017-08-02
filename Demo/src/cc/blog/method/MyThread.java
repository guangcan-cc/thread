package cc.blog.method;

/**
 * Created by Denny on 2017/7/10.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
