package ReadFile;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class readfile2{
    public static void main(String[] args)throws IOException {
        FileInputStream fr=new FileInputStream("ex.txt");
        BufferedInputStream bfr=new BufferedInputStream(fr);
        int i=0;
        while ((i=bfr.read())!=-1){//end of file checked
            System.out.print((char)i);
        }
    }
}

