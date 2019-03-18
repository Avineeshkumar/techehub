package writeFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class writefile2
{
    public static void main(String[] args)throws IOException {
        OutputStream fw=new FileOutputStream("ex1.txt",true);
        BufferedOutputStream bfw=new BufferedOutputStream(fw);
        String str="Buffered Output Stream Example!!!!!!!";
        bfw.write(str.getBytes());
        fw.close();
        System.out.println("Write successfully");
    }
}