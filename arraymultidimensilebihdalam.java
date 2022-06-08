import java.security.Identity;
import java.util.ArrayList;
import java.util.Arrays;

public class arraymultidimensilebihdalam {
    public static void main(String[] args) {
        int[][] array2D={
{1,2,3},
{1,2,4,5}

        };
        //printarray(array2D);
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);
        System.out.println("char 2 dimensi");
        char[] char1={'a','&','d','e'};
        char[] char2={'b','c','d','f'};
        char[][]char3={
            char1,
            char2
        };
        System.out.println(char3);
        System.out.println(char3[0]);
        System.out.println(char3[1]);
        System.out.println(System.identityHashCode(char1));
        System.out.println(System.identityHashCode(char2));
        System.out.println(Integer.toHexString( System.identityHashCode(char1)));
        System.out.println(Integer.toHexString( System.identityHashCode(char2)));
        System.out.println("\n");
        printarray(char3);
        
    }
    private static void printarray(char[][] dataarray) {
        System.out.println(dataarray);
        System.out.println(Arrays.toString(dataarray));
        System.out.println(Arrays.deepToString(dataarray));
    }
}
