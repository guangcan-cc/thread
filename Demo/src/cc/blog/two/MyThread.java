package cc.blog.two;

/**
 * Created by Denny on 2017/7/10.
 */
public class MyThread extends Thread{
    private int count = 5;

    public MyThread(){
    }

    public MyThread(String name){
        this.setName(name);
    }

    @Override
    public void run() {
        synchronized(MyThread.class) {
            while (count > 0) {
                count--;
                System.out.println("由 " + Thread.currentThread().getName() + " 计算，count = " + count);
            }
        }
    }
}
