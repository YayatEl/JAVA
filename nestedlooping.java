public class nestedlooping {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i==j) {
                    break;
                }
            }
            System.out.print("\n");
        }
     
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i==j) {
                    break;
                }else if (i+j==8) {
                   break; 
                }
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j > i; j++) {
                System.out.print("* ");
                if (j==i) {
                   break; 
                }
            }
            System.out.print("\n");
        }
    }
}
