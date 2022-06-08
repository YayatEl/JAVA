import java.util.Scanner;

public class latihanfungsi {
    public static void main(String[] args) {
        int panjang,lebar;
Scanner input=new Scanner(System.in);
System.out.println("masukkan nilai panjang:");
panjang=input.nextInt();
System.out.println("masukkan nilai lebar:");
lebar=input.nextInt();
fungsicallback(panjang, lebar);

}

    
    private static void gambar(int panjang,int lebar) {
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
        System.out.print("\n");} 
    }
    private static Integer hitungluas(int panjang,int lebar) {
      int luas=panjang*lebar;
       return luas; 
    }
    private static void fungsicallback(int panjang,int lebar) {
        gambar(panjang, lebar);

System.out.println(hitungluas(panjang, lebar));
    }
}
