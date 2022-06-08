import java.util.Scanner;

public class fungsiwhile {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
int a;
boolean kondisi=true;
a=input.nextInt();
while (kondisi==true) {
    
    --a;
    
    if (a==10) {
        kondisi=false;
        System.out.println("kondisi false:" +a);
    }
    System.out.println("ini adalah nila a:" +a);
}
System.out.println("ini diluar while:" +a);

    }
}
