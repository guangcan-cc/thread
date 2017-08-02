package cc.blog.wait_notify_insert_test;

/**
 * Created by Denny on 2017/7/19.
 */
public class Demo {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for(int i = 0; i < 20; i++){
            BackUpA backUpA = new BackUpA(dbTools);
            BackUpB backUpB = new BackUpB(dbTools);
            backUpA.start();
            backUpB.start();
        }
    }
}
