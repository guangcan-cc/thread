package cc.blog.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Elvis on 2017/8/25.
 */
public class Demo {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println(" 运行了！时间为：" + new Date().toLocaleString());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2017-08-25 16:24:00";
        Date dateRef = sdf.parse(dateString);
        System.out.println(" 字符串时间：" + dateRef.toLocaleString() + " 当前时间："
                + new Date().toLocaleString());
        timer.schedule(myTask,dateRef);
    }
}








