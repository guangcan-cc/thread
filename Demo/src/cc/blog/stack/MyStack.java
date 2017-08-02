package cc.blog.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denny on 2017/7/19.
 */
public class MyStack {

    private List<String> list = new ArrayList<>();

    synchronized public void push(){
        if(list.size() == 1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add("anything=" + Math.random());
        this.notify();
        System.out.println("push=" + list.size());
    }

    synchronized public String pop(){
        String returnValue = "";
        if(list.size() == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        returnValue = "" + list.remove(0);
        this.notify();

        System.out.println("pop=" + list.size());
        return returnValue;
    }
}
