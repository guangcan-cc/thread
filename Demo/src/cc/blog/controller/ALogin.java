package cc.blog.controller;

/**
 * Created by Denny on 2017/7/10.
 */
public class ALogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("a","aa");
    }
}
