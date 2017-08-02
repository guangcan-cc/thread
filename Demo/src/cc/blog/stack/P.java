package cc.blog.stack;

/**
 * Created by Denny on 2017/7/19.
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack){
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
