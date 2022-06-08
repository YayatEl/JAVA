import java.util.Scanner;

public class rekrusif {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("ini fungsi rekursif dalam bahasa inggris recrusive");
        int nilai=input.nextInt();
        name(nilai);
        System.out.println(penjumlahan(nilai));
        System.out.println(faktorial(nilai));
    }


    private static void name(int nilai) {
     
        System.out.println("ini adalah nilai ke :"+nilai);
        nilai--;
        if (nilai==0) {
            return;
        }
         name(nilai);
    }
    private static int penjumlahan(int nilai) {
        System.out.println("ini paramter ke="+nilai);
        if (nilai==0) {
            return nilai;
        }
        return nilai+penjumlahan(nilai-1);
    }
    private static int faktorial(int nilai) {
        System.out.println("ini paramter ke="+nilai);
        if (nilai==1) {
            return nilai;
        }
        return nilai*faktorial(nilai-1);
    }
}
