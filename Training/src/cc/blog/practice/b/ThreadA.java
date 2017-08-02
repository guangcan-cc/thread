package cc.blog.practice.b;

/**
 * Created by Denny on 2017/8/2.
 */
public class ThreadA implements Runnable {

    @Override
    synchronized public void run() {
        System.out.println("正在执行...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("阻塞完毕....唤醒成功》。。");
    }
}
