package cc.blog.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Denny on 2017/7/26.
 */
public class Demo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        CycWork cycWork = new CycWork(cyclicBarrier,"张三");
        CycWork cycWork1 = new CycWork(cyclicBarrier,"李四");
        CycWork cycWork2 = new CycWork(cyclicBarrier,"王五");

        executor.execute(cycWork);
        executor.execute(cycWork1);
        executor.execute(cycWork2);

        executor.shutdown();
    }
}
