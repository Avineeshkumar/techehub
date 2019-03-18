package writeFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class writefile
{
    public static void main(String[] args)throws IOException {
        OutputStream fw=new FileOutputStream("ex.txt",true);
        String str="Hello World!!!!";
        fw.write(str.getBytes());
        fw.close();
        System.out.println("Write successfully");
    }
}
