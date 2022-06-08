
import java.util.Arrays;

public class latihanarray2d {
    public static void main(String[] args) {
        System.out.println("latihan matriks");

int matriks1[][]={
{1,2},
{1,2}


};
int[][]matriks2={
{2,3},
{4,5}

};
printArray(matriks1);
printArray(matriks2);

/*int baris_a=matriks1.length;
int kolom_a=matriks1[0].length;
int[][]matrikhasil=new int[baris_a][kolom_a];
for (int i = 0; i < baris_a; i++) {
    for (int j = 0; j < kolom_a; j++) {
        matrikhasil[i][j]=matriks2[i][j]+matriks1[i][j];
    }
    
}
printArray(matrikhasil);
*/
printArray(penjumlahanmatrik(matriks1,matriks2));
printArray(perkalianmatriks(matriks1, matriks2));
    }
    private static void printArray(int[][] dataarray) {
        System.out.println(dataarray);
        System.out.println(Arrays.toString(dataarray));
        System.out.println(Arrays.deepToString(dataarray));
int baris=dataarray.length;
int kolom=dataarray[0].length;
for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataarray[i][j]);
                if (j<(kolom-1)) {
                    
                    System.out.print(",");
                }else{
                    System.out.print("]");
                    
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    private static int[][] penjumlahanmatrik(int[][]matrika, int[][] matrikb) {
       int barisa=matrika.length;
       int koloma=matrika[0].length;
       int barisb=matrikb.length;
       int kolomb=matrikb[0].length;

       int[][]matrikshasil=new int[barisa][koloma];
if (koloma==kolomb && barisa==barisb) {
    for (int i = 0; i <barisa; i++) {
        for (int j = 0; j < koloma; j++) {
            matrikshasil[i][j]=matrika[i][j]+matrikb[i][j];
        }
    }
} else {
    System.out.println("kolom dan baris tidak sama");
    
}return matrikshasil;



    }
private static int[][] perkalianmatriks(int[][] matriks3,int[][] matriks4) {
    int baris1=matriks3.length;
    int kolom1=matriks3[0].length;
    int baris2=matriks4.length;
    int kolom2=matriks4[0].length;
    int[][]hasil=new int[baris1][kolom2];
    int buffer;
    for (int i = 0; i < baris1; i++) {
        for (int j = 0; j <kolom2; j++) {
            buffer=0;
           for (int k= 0; k < kolom1; k++) {
               buffer+=matriks3[i][k]*matriks4[k][j];
               System.out.print(buffer);
             
            }hasil[i][j]=buffer;
           }
           
        }return hasil;
    }

}
