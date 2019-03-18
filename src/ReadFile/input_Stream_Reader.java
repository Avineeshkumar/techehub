package ReadFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_Stream_Reader
{
    public static void main(String[] args)throws IOException {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader brdr=new BufferedReader(input);
        System.out.println("Enter the Id:");
        int id_str=Integer.parseInt(brdr.readLine());//Integer.parseInt converts readed string to integer

        System.out.println("Id:"+id_str);


    }

}
