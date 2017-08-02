package cc.blog.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by Denny on 2017/7/19.
 */
public class Demo {

    public static void main(String[] args) throws IOException, InterruptedException {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedOutputStream out = new PipedOutputStream();
        PipedInputStream input = new PipedInputStream();

        out.connect(input);

        ThreadRead threadRead = new ThreadRead(readData,input);
        threadRead.start();

        Thread.sleep(2000);

        ThreadWrite threadWrite = new ThreadWrite(writeData,out);
        threadWrite.start();
    }
}
