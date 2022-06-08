import java.util.Arrays;

public class latihanarray {
    public static void main(String[] args) {
        System.out.println("sorting array terbalik");
        int[] arrayangka={1,2,3,4,5};
        int[] arrayangka2={2,3,4,5,6};

        int[] arraybaru=penjumlahanarray(arrayangka, arrayangka2);
        printArray(arrayangka, Arrays.toString(arrayangka));
        printArray(arrayangka2, Arrays.toString(arrayangka2));
       printArray(arraybaru,Arrays.toString(arraybaru));
       //menggabungkan dua buah array
        int hasil2[]=new int[arrayangka.length+arrayangka2.length];
for (int i = 0; i < arrayangka.length; i++) {
    hasil2[i]=arrayangka[i];
}

printArray(hasil2,Arrays.toString(hasil2));
for (int i = 0; i < arrayangka2.length; i++) {
    hasil2[i+arrayangka.length]=arrayangka2[i];
}
printArray(hasil2,Arrays.toString(hasil2));


//sorting reverse

Arrays.sort(arrayangka);
printArray(arrayangka,"ini disorted" );
int arrybuffer[]=Arrays.copyOf(arrayangka,arrayangka.length);
int[]arrayreversed=new int[arrayangka.length];
for (int i = 0; i < arrybuffer.length; i++) {
    arrayangka[i]=arrybuffer[(arrybuffer.length-1)-i];
}
printArray(arrayangka, "reversed");

reverse(arrayangka2);
printArray(arrayangka2, "balik array 2");


reverse2(arrayangka2);
printArray(arrayangka2, "pakai revese 2");

    }
    private static int[] penjumlahanarray(int[] dataarray1,int[] dataarray2) {
        int[]arrayhasil= new int[dataarray1.length];
        
        for (int i = 0; i < arrayhasil.length; i++) {
            arrayhasil[i]=dataarray1[i]+dataarray2[i];
        }return arrayhasil;
    }
    private static void printArray(int[] dataarray,String message) {
        System.out.println("ini adalah array:"+dataarray+"ini adalah string array:"+ Arrays.toString(dataarray) +"ini adalaha message string"+message);
    }
    private static void reverse(int[] dataarray) {
        Arrays.sort(dataarray);
        int[]arraybuffer=Arrays.copyOf(dataarray, dataarray.length);
        for (int i = 0; i < dataarray.length; i++) {
            dataarray[i]=arraybuffer[(arraybuffer.length-1)-i];
        }
    }

    //reverse 2 more fast and no new array
private static void reverse2(int[] dataarray) {
    Arrays.sort(dataarray);
    int buffer;
    for (int i = 0; i < dataarray.length/2; i++) {
        buffer=dataarray[i];
        dataarray[i]=dataarray[(dataarray.length-1)-i];
        dataarray[(dataarray.length-1)-i]=buffer;
    }
   
}
}
