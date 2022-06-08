import java.util.Scanner;

public class inputarimatika {
    public static void main(String[] args) {
        int lebar,panjang,luas;
        Scanner userinput=new Scanner(System.in);
        System.out.println("MENGHITUNG LUAS:");
        System.out.println("PANJANG:");
        panjang=userinput.nextInt();
        System.out.println("LEBAR4:");
        lebar=userinput.nextInt();
      
        luas=(panjang *lebar);
        System.out.printf("Luas persegi adalah :%d",luas);


    }
}
