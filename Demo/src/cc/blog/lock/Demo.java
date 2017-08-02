package cc.blog.lock;

/**
 * Created by Denny on 2017/7/20.
 */
public class Demo {

    public static void main(String[] args) {
        LockService lockService = new LockService();
        ThreadService threadServiceA = new ThreadService(lockService);
        ThreadService threadServiceB = new ThreadService(lockService);
        ThreadService threadServiceC = new ThreadService(lockService);
        ThreadService threadServiceD = new ThreadService(lockService);
        ThreadService threadServiceE = new ThreadService(lockService);
        threadServiceA.start();
        threadServiceB.start();
        threadServiceC.start();
        threadServiceD.start();
        threadServiceE.start();
    }
}
