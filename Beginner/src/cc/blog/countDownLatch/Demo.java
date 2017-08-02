package cc.blog.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Denny on 2017/7/25.
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Work work1 = new Work(countDownLatch,"张三");
        Work work2 = new Work(countDownLatch,"李四");
        Work work3 = new Work(countDownLatch,"王五");

        Boss boss = new Boss(countDownLatch);

        executor.execute(work1);
        executor.execute(work2);
        executor.execute(work3);
        executor.execute(boss);

        executor.shutdown();
    }
}
