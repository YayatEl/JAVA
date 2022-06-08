import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class execptmainmethod {
    public static void main(String[] args) throws IOException {
       // int[] array={1,2,3,4,5};
       // Scanner inputUser=new Scanner(System.in);
        //int index=inputUser.nextInt();
        //System.out.println(array[index]);
        //System.out.println("akhir program");
        FileInputStream fileInputStream=new FileInputStream("input.txt");
        System.out.println((char)fileInputStream.read());
    }
}
