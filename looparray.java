import java.util.Arrays;

public class looparray {
    public static void main(String[] args) {
        int arrayangka[]={2,3,4,5,6,7};

System.out.println(Arrays.toString(arrayangka));
//looping property
for (int i = 0; i < arrayangka.length; i++) {
    System.out.println("ini index ke: "+i+" adalah=" +arrayangka[i]);
}
//looping khusus on untuk collection without indexing
System.out.println(" looping dengan for each");
for (int angka : arrayangka) {
    
    System.out.println("ini index ke: "+angka);
}
    }
}
