import java.util.Scanner;

public class latihanlooping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ini program untuk menjumlahkan");
        int nilaitotal;
        int nilaiawal=input.nextInt();
        int nilaiakhir=input.nextInt();
        
        /*while (nilaiawal<=nilaiakhir) {
       nilaitotal=nilaiawal+nilaitotal;
            System.out.println("ditambah :"+nilaiawal+"menjadi:"+nilaitotal);
            nilaiawal++;
        }*/
       /* do {
            nilaitotal=nilaiawal+nilaitotal;
                 System.out.println("ditambah :"+nilaiawal+"menjadi:"+nilaitotal);
                 nilaiawal++;
                } while (nilaiawal<=nilaiakhir);*/
                
         for (nilaitotal=0; nilaiawal<=nilaiakhir;nilaiawal++ ) {
           nilaitotal=nilaiawal+nilaitotal;
                    
                    
            System.out.println("ditambah :"+nilaiawal+"menjadi:"+nilaitotal);
      }
}
}