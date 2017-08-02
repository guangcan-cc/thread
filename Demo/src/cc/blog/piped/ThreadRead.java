package cc.blog.piped;

import java.io.PipedInputStream;

/**
 * Created by Denny on 2017/7/19.
 */
public class ThreadRead extends Thread {

    private ReadData readData;

    private PipedInputStream input;

    public ThreadRead (ReadData readData, PipedInputStream input){
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}
