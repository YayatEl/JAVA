import java.util.Scanner;

public class pengenalanmethod {
    public static void main(String[] args) {
       //y=(x+2)*x
       int x,y;
       Scanner input=new Scanner(System.in);
       x=input.nextInt();
       y=methodlain.hitung(x);
       System.out.println(y);
    }
    
   private static int hitung(int x) {
        int y;
        y=(x+2)*x;
        return y;
    }

}
   

