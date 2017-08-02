package cc.blog.entity;

/**
 * Created by Denny on 2017/7/19.
 */
public class C {
    private String lock ;

    public C (String lock) {
        this.lock = lock ;
    }

    public void getValue(){
        try{
            synchronized (lock) {
                while("".equals(ValueObject.value)){
                    System.out.println("消费者 " + Thread.currentThread().getName() + "waiting 了");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + "runnable 了");
                ValueObject.value = "";
                lock.notifyAll();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
