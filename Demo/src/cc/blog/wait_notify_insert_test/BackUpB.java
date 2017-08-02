package cc.blog.wait_notify_insert_test;

/**
 * Created by Denny on 2017/7/19.
 */
public class BackUpB extends Thread {

    private DBTools dbTools;

    public BackUpB(DBTools dbTools){
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
