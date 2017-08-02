package cc.blog.wait_notify_insert_test;

/**
 * Created by Denny on 2017/7/19.
 */
public class BackUpA extends Thread {

    private DBTools dbTools;

    public BackUpA (DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
