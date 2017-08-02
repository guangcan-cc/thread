package cc.blog.entity;

/**
 * Created by Denny on 2017/7/18.
 */
public class P {

    private String lock ;

    public P (String lock) {
        this.lock = lock ;
    }

    public void setValue(){
        try{
            synchronized (lock) {
                while(!"".equals(ValueObject.value)){
                    System.out.println("生产者" + Thread.currentThread().getName() + "waiting 了...");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "runnable 了...");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value ;
                lock.notifyAll();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
