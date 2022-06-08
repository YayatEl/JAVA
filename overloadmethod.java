import java.util.Scanner;

public class overloadmethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka= input.nextInt();

//overload(angka);

float hasil=tambah(4.5f, 4.3f);
overload(hasil);

    }
    private static float tambah(float angka1,float angka2) {
       return angka1+angka2;
    }
    private static void overload(int angka) {
        System.out.println(angka);
    }
    private static void overload(float angka) {
        System.out.println(angka);
    }
}
