package ReadFile;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Full Name:");
        String str1=input.nextLine();
        System.out.println("Enter the Id:");

        int id=input.nextInt();
        System.out.println("Id is:"+id);
        //System.out.println("Enter the Name:");
        //String str=input.next();//It will take the space as char
        //System.out.println("Name:"+str);

        System.out.println("Full Name:"+str1);



    }
}
