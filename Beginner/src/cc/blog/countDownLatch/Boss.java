package cc.blog.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Denny on 2017/7/25.
 */
public class Boss implements Runnable {

    private CountDownLatch downLatch;

    public Boss (CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }

    @Override
    public void run() {
        System.out.println("老板正在等待工人把活儿干完...");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("工人活都干完了，老板开始检查了...");
    }
}
