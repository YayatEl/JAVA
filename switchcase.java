import java.util.Scanner;

public class switchcase {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
  // int a,b;
// a=input.nextInt();
// b=input.nextInt();  
   String inputs;
   System.out.println("Panggil nama:");
   inputs=input.next();
   System.out.println(inputs);

//ekspresinya berupa satuan bisa berupa short int long byte
switch (inputs) {
    case "otong":
    System.out.println("Panggil nama:"+inputs);
    
    break;// go outside the function
    
    case "yayat":
    System.out.println("Panggil nama:"+inputs);
    
    break;
    
    default:
    System.out.println("Panggil nama:"+inputs);
    
        break;
}
    }
}