import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        float a,b,c;
        
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai pertama:");
        a=input.nextFloat();
        System.out.print("Masukkan nilai kedua:");
        b=input.nextFloat();
        System.out.print("Masukkan nilai operator:");
        char d;
        d=input.next().charAt(0);
       
switch(d) {
    case '+':
    c=a+b;
    System.out.printf("hasil %f + %f = %f",a,b,c);    
    break;
    case'-':
    c=a-b;
    System.out.printf("hasil %f - %f = %f",a,b,c);    
    
    break;
    case'/':
    c=a/b;
    System.out.printf("hasil %f / %f = %f",a,b,c);    
    
    break;
    case '*':
    c=a*b;
    
    System.out.printf("hasil %f *%f = %f",a,b,c);    
    break;
    case'%':
    c=a%b;
    System.out.printf("hasil %f % %f = %f",a,b,c);    
     
    break;
    default:
    break;
}
    }
}
