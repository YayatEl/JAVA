import java.util.FormattableFlags;
import java.util.Formatter;
import java.util.Scanner;

public class methodexecption {
    public static void main(String[] args) {
        Scanner inputUser=new Scanner(System.in);
        System.out.println("masukkan index array:");
        int indexInput=inputUser.nextInt();
        int[] array1={1,2,3,4,5};
        System.out.println("excption in method");
        int fungsiambil= Ambildata(array1, indexInput);
        System.out.println("ini adalha index ke-"+fungsiambil);
        
        StringBuilder sBuilder=new StringBuilder(fungsiambil);
        Formatter formatter=new Formatter(sBuilder);
        System.out.println(formatter);
        try {
            System.out.println("execption in main");
            System.out.printf("data ke- %d \n",array1[indexInput]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
        //execption throw by method
        try{
             
            System.out.println("execption throw method");
        int fungsiambil2= Ambildata3(array1, indexInput);
        System.out.println(fungsiambil);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    private static int Ambildata2(int[] darray,int indexInput) {
        int hasil2=0;
     
            hasil2=darray[indexInput];
            
       
        return hasil2;
    }
    private static int Ambildata3(int[] darray,int indexInput)throws Exception {
        int hasil3=0;
     
            hasil3=darray[indexInput];
            
       
        return hasil3;
    }
    
    private static int Ambildata(int[] dataArray,int dataIndex) {
        
       int hasil=0;
       
        try {
            
        hasil=dataArray[dataIndex];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
        return hasil;
        
    }
}
