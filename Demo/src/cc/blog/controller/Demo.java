package cc.blog.controller;

/**
 * Created by Denny on 2017/7/10.
 */
public class Demo {
    public static void main(String[] args) {
        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();
        aLogin.start();
        bLogin.start();
    }
}
