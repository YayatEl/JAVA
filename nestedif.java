import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //nested if
int a,b;
a=input.nextInt();
b=input.nextInt();
        if (a==5) {
         if (b==2) {
             System.out.println("nested if");
         }else{

            System.out.println("print else");
         }  
        }
    }
}
