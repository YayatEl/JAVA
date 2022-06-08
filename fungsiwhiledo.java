import java.util.Scanner;

public class fungsiwhiledo {
    public static void main(String[] args) {
        int a=0;
        boolean kondisi;
        Scanner input=new Scanner(System.in);
kondisi=true;
        do {
            System.out.println("do while nilai a:"+a);
            if (a==10) {
                kondisi=false;
            }
            a++;
        } while (kondisi);
    }
}
