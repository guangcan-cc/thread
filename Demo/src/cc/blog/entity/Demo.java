package cc.blog.entity;

/**
 * Created by Denny on 2017/7/19.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] threadP = new ThreadP[2];
        ThreadC[] threadC = new ThreadC[2];

        for(int i = 0 ; i < 2 ; i ++){
            threadP[i] = new ThreadP(p);
            threadP[i].setName("生产者" + (i + 1));
            threadC[i] = new ThreadC(c);
            threadC[i].setName("消费者" + (i + 1));
            threadP[i].start();
            threadC[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArr = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArr);
        for(int i = 0; i < threadArr.length; i++){
            System.out.println(threadArr[i].getName() + " " + threadArr[i].getState());
        }
    }
}
















