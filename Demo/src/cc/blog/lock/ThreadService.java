package cc.blog.lock;

/**
 * Created by Denny on 2017/7/20.
 */
public class ThreadService extends Thread {

    private LockService lockService;

    public ThreadService (LockService lockService) {
        this.lockService = lockService;
    }

    @Override
    public void run() {
        lockService.testMethod();
    }
}
