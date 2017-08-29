package cc.blog.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Elvis on 2017/8/25.
 */
public class TimeRun2Demo {
    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println(" A运行了！时间为：" + new Date().toLocaleString());
            this.cancel();
        }
    }
    public static class MyTask2 extends TimerTask{
        @Override
        public void run() {
            System.out.println(" B运行了！时间为：" + new Date().toLocaleString());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask1 myTask1 = new MyTask1();
        MyTask2 myTask2 = new MyTask2();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2017-08-25 17:55:00";
        Timer timer = new Timer();
        System.out.println(" 字符串时间：" + dateString + " 当前时间："
                + new Date().toLocaleString());
        timer.schedule(myTask1,sdf.parse(dateString),4000);
        timer.schedule(myTask2,sdf.parse(dateString),4000);
    }
}
