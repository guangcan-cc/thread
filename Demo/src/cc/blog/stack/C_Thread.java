package cc.blog.stack;

/**
 * Created by Denny on 2017/7/19.
 */
public class C_Thread extends Thread {
    private C c;

    public C_Thread (C c){
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.popService();
        }
    }
}
