package cc.blog.piped;

import java.io.PipedOutputStream;

/**
 * Created by Denny on 2017/7/19.
 */
public class ThreadWrite extends Thread{

    private WriteData writeData;
    private PipedOutputStream out;

    public ThreadWrite (WriteData writeData, PipedOutputStream out){
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }

}
