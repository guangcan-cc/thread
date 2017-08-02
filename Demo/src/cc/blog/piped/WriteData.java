package cc.blog.piped;


import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by Denny on 2017/7/19.
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try{
            System.out.println("write :");
            for(int i = 0; i < 300; i++){
                String outDate = "" + (i + 1);
                out.write(outDate.getBytes());
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
