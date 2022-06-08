import java.sql.Array;
import java.util.Arrays;

public class operasipadarray {
    public static void main(String[] args) {
        int[] arrayangka={1,2,3,4,5};
        //merubah array menjadi stirng
printarray(arrayangka);
//mengkopy array
int arrayangka2[]= new int[5];
printarray(arrayangka);
printarray(arrayangka2);
System.out.println("mengkopi nilai array dengan loop\n===========================\n");
for (int i = 0; i < arrayangka.length; i++) {
    arrayangka2[i]=arrayangka[i];
}
printarray(arrayangka);
printarray(arrayangka2);
//mengkopi element tanpa merubah address
System.out.println(arrayangka);
System.out.println(arrayangka2);
//mengkopi element dengan fungsi copy
System.out.println("mengkopi nilai array dengan arrays utiliti copyof\n===========================\n");
int[] arrayangka3=Arrays.copyOf(arrayangka,7);
printarray(arrayangka3);
System.out.println(arrayangka3);
System.out.println("mengkopi nilai array dengan arrays utiliti copyofrange\n===========================\n");
int arrayangka4[]=Arrays.copyOfRange(arrayangka, 2, 5);   
printarray(arrayangka4); 
System.out.println("mengkopi nilai array dengan arrays utiliti fill ofarray\n===========================\n");
int[]arrayangka5=new int[10];
printarray(arrayangka5);
Arrays.fill(arrayangka5, 1);
printarray(arrayangka5);
System.out.println("komparasi array \n===========================\n");
if (arrayangka==arrayangka2) {
    System.out.println("array ini sama");
}else{
System.out.println("array ini beda");

}

//boolean x=(arrayangka==arrayangka2)?(System.out.println("sama")):(System.out.print("beda"));
//System.out.println(x);
System.out.println("array aman yang lebih besar");
System.out.println(Arrays.compare(arrayangka4, arrayangka2));
System.out.println(Arrays.compare(arrayangka5, arrayangka2));
System.out.println("mana index yang berbeda");
System.out.println(Arrays.mismatch(arrayangka, arrayangka2));
System.out.println("sort array");
int[] arrayangka8={1,3,2,3,4,4,6,7};
//Arrays.sort(arrayangka8);
printarray(arrayangka8);

System.out.println("search array");
int angka=4;
System.out.println(Arrays.binarySearch(arrayangka8,angka));

}
    private static void printarray(int[] dataarray) {
        System.out.println(Arrays.toString(dataarray));
        
    }
   


}
