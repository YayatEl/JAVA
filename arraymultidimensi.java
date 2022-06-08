import java.util.Arrays;

public class arraymultidimensi {
    public static void main(String[] args) {
        System.out.println("array multi dimensi");

        int[][]array2dimensi={
            {1,2,3,4,},
            {1,2,3,4}
        };
System.out.println(Arrays.deepToString(array2dimensi));
//membuat array multi dimensi dengan assigment
int[][]array2dimensi2= new int[4][2];
//ini jadi [baris][kolom]
for (int i = 0; i < array2dimensi2.length; i++) {
    System.out.println(Arrays.toString(array2dimensi2[i]));
}
printArray(array2dimensi2);

///looping lengkap secara manual
System.out.println("hasil perulangan manual");
for (int i = 0; i < array2dimensi2.length; i++) {
    System.out.print("[");
    for (int j = 0; j<array2dimensi2[i].length; j++) {
        System.out.print(array2dimensi2[i][j]+",");
    }
    System.out.print("]\n");
}
System.out.println("loooping for each");
for (int[] baris : array2dimensi2) {
    System.out.print(baris);
    System.out.print("[");
    for (int angka : baris) {
        System.out.print(angka+",");
    }
    System.out.print("]\n");
}

int array_ranged[][]={
{1,2,3,45},{13,34,23},
{8}

};
printArray(array_ranged);
    }
    private static void printArray(int[][] dataarray) {
        System.out.println("hasil fungsi");
        System.out.println(Arrays.toString(dataarray));
        System.out.println(Arrays.deepToString(dataarray));
        for (int i = 0; i < dataarray.length; i++) {
            System.out.println(Arrays.toString(dataarray[i]));
        }
    }
}
