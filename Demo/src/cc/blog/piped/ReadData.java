package cc.blog.piped;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by Denny on 2017/7/19.
 */
public class ReadData {

    public void readMethod(PipedInputStream input) {
        try{
            System.out.println("read :");
            byte[] byteArr = new byte[20];
            int readLength = input.read(byteArr);
            while(readLength != -1){
                String newData = new String(byteArr,0,readLength);
                System.out.println(newData);
                readLength = input.read(byteArr);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
