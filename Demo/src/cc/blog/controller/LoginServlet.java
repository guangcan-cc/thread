package cc.blog.controller;

/**
 * Created by Denny on 2017/7/10.
 */
public class LoginServlet {
    private static String usernameref;
    private static String passwordref;
    public synchronized static void doPost(String username,String password){

        usernameref = username;
        if("a".equals(username)){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordref = password;

        System.out.println("username=" + usernameref + "password=" + passwordref);

    }
}
