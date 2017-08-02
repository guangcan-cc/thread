package cc.blog.join;

/**
 * Created by Denny on 2017/7/20.
 */
public class Demo {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i = 0; i < 100; i++){
            System.out.println("我也在执行....");
            System.out.println("我也在执行....");
            System.out.println("我也在执行....");
            System.out.println("我也在执行....");
        }
        try {
            myThread.join(2000);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("输出的数字时间结束后我再执行....");
    }
}
