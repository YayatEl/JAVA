import java.util.Arrays;

public class stringintro {
    public static void main(String[] args) {
        //membuat string assigment
        String kata="kata";
        System.out.println(kata);
        //menampilkan string
        char[] katachar={'k','a','t','a'};
        System.out.println(Arrays.toString(katachar));
        //mengakses komponen string
        System.out.println(katachar[0]);
        System.out.println(kata.charAt(0));
        //merubah kompenen dalam string tidak bisa ummitable
        katachar[0]='b';
        System.out.println(katachar);
        //merubah string dengan secara tidak langsung
       // kata.substring(1,2);
       //heap,stack,stringpool memory dari java
       System.out.println(System.identityHashCode(kata));
        System.out.println("c"+ kata.substring(1,4));
        printAddress(kata);
        
    }
    private static void printAddress(String data) {
        int memo=System.identityHashCode(data);
        System.out.println(System.identityHashCode(memo));
        
    }
}
