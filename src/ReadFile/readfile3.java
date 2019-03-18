package ReadFile;
import java.io.FileReader;
import java.io.IOException;
public class readfile3{
    public static void main(String[] args)throws IOException {
        FileReader ffr=new FileReader("ex.txt");

        int i=0;
        while ((i=ffr.read())!=-1){//end of file checked
            System.out.print((char)i);
        }
    }
}