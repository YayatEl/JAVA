import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("fungsi if else if else");
        System.out.printf("masukkan a:");
        a=input.nextInt();
        System.out.printf("masukkan b:");
        b=input.nextInt();
        System.out.printf("masukkan c:");
        c=input.nextInt();
        if (a==b) {
            System.out.printf("nilai a==b");
            
        }else if(a>c){
            System.out.printf("nilai a>c");
            
            
            
        }else if (b==c) {
            System.out.printf("nilai b==c");
            
        }else{
            System.out.printf("else");

        }
    }
}
