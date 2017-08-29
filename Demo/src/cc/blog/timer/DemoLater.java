package cc.blog.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Elvis on 2017/8/25.
 */
public class DemoLater {
    private static Timer timer = new Timer();
    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为：" + new Date());
                Thread.sleep(20000);
                System.out.println("1   end 运行了！时间为：" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class MyTask2 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("2 begin 运行了！时间为：" + new Date());
                Thread.sleep(20000);
                System.out.println("2   end 运行了！时间为：" + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask1 myTask1 = new MyTask1();
        MyTask2 myTask2 = new MyTask2();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString1 = "2017-08-25 17:30:00";
        String dateString2 = "2017-08-25 17:30:10";
        Date dateRef1 = sdf.parse(dateString1);
        Date dateRef2 = sdf.parse(dateString2);
        System.out.println(" 字符串时间：" + dateRef1.toLocaleString() + " 当前时间："
                + new Date().toLocaleString());
        System.out.println(" 字符串时间：" + dateRef2.toLocaleString() + " 当前时间："
                + new Date().toLocaleString());
        timer.schedule(myTask1,dateRef1);
        timer.schedule(myTask2,dateRef2);
    }
}
