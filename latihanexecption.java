import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class latihanexecption {
    public static void main(String[] args) {
        int[] array1={0,1,2,3};
        Scanner iScanner=new Scanner(System.in);
System.out.println("masukkan nilai index :");
        int index=iScanner.nextInt();
      //  System.out.printf("array ke %d %d \n", index,array1[index]);
        //error runtime out from method execption handling
try {
    System.out.printf("array ke %d %d \n", index,array1[index]);
} catch (Exception e) {
    System.out.println(e);
}
try {
    System.out.printf("array ke %d %d \n", index,array1[index]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(e);
}



//runtime eroor jika file tidak ada

FileInputStream fileInput=null;
try {
    
    fileInput=new FileInputStream("input.txt");
} catch (IOException e) {
    System.out.println(e);
}
//mengabunggkan 2 execption
try {
    System.out.printf("array ke %d %d \n", index,array1[index]);
    fileInput=new FileInputStream("input.txt");
    
} catch (Exception e) {
    System.out.println(e);

}
try {
    System.out.printf("array ke %d %d \n", index,array1[index]);
    fileInput=new FileInputStream("input.txt");
    
} catch (IOException e) {
    System.out.println(e);

}catch(IndexOutOfBoundsException e){
    System.out.println(e);
}finally{
    System.out.println("ini adalah finally");
}
        System.out.println("ini adalah akhir dari  program");
    }
}
