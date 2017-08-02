package cc.blog.entity;

/**
 * Created by Denny on 2017/7/19.
 */
public class ThreadC extends Thread{

    private C c;

    public ThreadC (C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
