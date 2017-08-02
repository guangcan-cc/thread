package cc.blog.stack;

/**
 * Created by Denny on 2017/7/19.
 */
public class C {

    private MyStack myStack;

    public C (MyStack myStack){
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("pop=" + myStack.pop());
    }
}
