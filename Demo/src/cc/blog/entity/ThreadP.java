package cc.blog.entity;

/**
 * Created by Denny on 2017/7/19.
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p){
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
