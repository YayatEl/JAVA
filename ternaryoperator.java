import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //ternary operator x=true
        System.out.print("Masukkan nilai");
       int x, inputi=input.nextInt();

       x=(inputi==10)?(inputi*inputi):(inputi/2);
       System.out.println(x);
       
       x=(inputi==9)?(inputi/2):(inputi/6);
       System.out.println(x);
    }
}
