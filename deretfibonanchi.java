import java.util.Scanner;

public class deretfibonanchi {
    public static void main(String[] args) {
        int fn,fn_1, fn_2,n;
        System.out.println("ini software fibonanchi");
Scanner input=new Scanner(System.in);
   fn_2=0;
   fn_1=1;

    n=input.nextInt();
for (int i = 1; i < n; i++) {
    fn=fn_1+fn_2;
    fn_2=fn_1;
    fn_1=fn;
System.out.println("ini adalah nilai ke :"+n +"nilai fobonanchi"+fn);    
}

    }
}
