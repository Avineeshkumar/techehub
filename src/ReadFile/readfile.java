package ReadFile;
import java.io.FileInputStream;
import java.io.IOException;
public class readfile {
    public static void main(String[] args)throws IOException {
        FileInputStream fr=new FileInputStream("ex.txt");
        int i=0;
        while ((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    }
}
