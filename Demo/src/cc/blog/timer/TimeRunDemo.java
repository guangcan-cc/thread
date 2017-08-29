package cc.blog.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Elvis on 2017/8/25.
 */
public class TimeRunDemo {
    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println(" A 运行了！时间为：" + new Date().toLocaleString());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" A 结束了！时间为：" + new Date().toLocaleString());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2017-08-25 17:40:00";
        Timer timer = new Timer();
        Date dateRef = sdf.parse(dateString);
        System.out.println(" 字符串时间：" + sdf.format(dateRef) + " 当前时间：" + sdf.format(new Date()));
        timer.schedule(myTask,dateRef,1000);
    }
}
