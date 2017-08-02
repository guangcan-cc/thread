package cc.blog.join;

/**
 * Created by Denny on 2017/7/20.
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        int secondValue = (int) (Math.random() * 10000);
        System.out.println(secondValue);
        for(int i = 0; i < 100; i++){
            System.out.println("MyThread在执行....");
            System.out.println("MyThread在执行....");
            System.out.println("MyThread在执行....");
            System.out.println("MyThread在执行....");
        }
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
