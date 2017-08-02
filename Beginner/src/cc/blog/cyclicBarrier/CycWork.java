package cc.blog.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Denny on 2017/7/26.
 */
public class CycWork implements Runnable {

    private CyclicBarrier cyclicBarrier;
    private String name;

    public CycWork (CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "正在打桩...");
        try {
            Thread.sleep(5000);
            System.out.println(name + "不容易，终于把桩打完了...");
            try {
                cyclicBarrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + ":其他逗比把桩都打完了，我又要开始工作了....");
    }
}
