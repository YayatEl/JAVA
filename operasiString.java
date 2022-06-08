import java.util.Scanner;

public class operasiString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
System.out.println("silahkan masukkkan string");
        String dataString=input.next();
FungsiPrint(dataString);
//MENGAMBIL KOMPONEN STRING
FungsiPrint(dataString.substring(0, 2));
//concat concation
FungsiPrint(dataString+" durian");
//concat no string
int jumlah=5;
FungsiPrint(dataString+" makan"+jumlah);
FungsiPrint(dataString.concat("jambu"));
//uppercase/lowercase
FungsiPrint(dataString.toUpperCase());
FungsiPrint(dataString.toLowerCase());
//replace
FungsiPrint(dataString.replace("makan", "minum"));
//equality
String kataInput="test";
String kataTest="test";
String kataTest2=new String("test");//diluar string pool memory
if (kataInput==kataTest) {
    System.out.println("sama");
} else {
    System.out.println("tidak sama");

}
if (kataInput==kataTest2) {
    System.out.println("sama");
} else {
    System.out.println("tidaksama");
}
if (kataInput.equals(kataTest2)) {
    System.out.println("sama");
} else {
    System.out.println("tidaksama");
}
System.out.println(System.identityHashCode( kataInput));
System.out.println(System.identityHashCode( kataTest));
System.out.println(System.identityHashCode( kataTest2));
//comparation string
String motor1,motor2;
motor1="harley";
motor2="kawasaki";
System.out.println(motor1.compareTo(motor2));//jarak antara alfabetic
System.out.println(motor2.compareTo(motor1));

    }
    private static void FungsiPrint(String dataPrint) {
        System.out.println(dataPrint);
    }
}
