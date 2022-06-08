import java.util.Arrays;

public class arraylebihdalam {
    public static void main(String[] args) {

        int[] arrayangaka={1,2,3,4,5,6,};
        int arrayangka2[]=new int[5];
        System.out.println(arrayangaka);
        System.out.println(arrayangka2);
        //tidak mengkopi memory,memakai address yang sama tidak sama dengan assigment int biasa
        arrayangka2=arrayangaka;
        System.out.println(Arrays.toString(arrayangaka));
        System.out.println(Arrays.toString(arrayangka2));
        arrayangaka[0]=100;
        arrayangka2[2]=500;
        System.out.println(Arrays.toString(arrayangaka));
        System.out.println(Arrays.toString(arrayangka2));
        System.out.println(arrayangaka);
        System.out.println(arrayangka2);
        ubaharray(arrayangaka);
        //System.out.println(Arrays.toString(arrayangaka));
        //System.out.println(Arrays.toString(arrayangka2));
    }
    //method yang argumentnya adalah reference,pass by reference
    //not pass by value
    private static void ubaharray(int[] dataarray) {
        for (int data : dataarray) {
            System.out.println(data);
        }
        dataarray[0]=125;
        for (int data : dataarray) {
            System.out.println(data);
        }
    }
}
