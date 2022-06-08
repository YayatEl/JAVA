import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class crud1 {
    public static void main(String[] args)throws IOException {
        Scanner termiScanner=new Scanner(System.in);
        String optionUser;
     
     //   clearScreen();
        boolean isLajutkan=true;
        while (isLajutkan) {
            
            
            System.out.println("program database");
            System.out.println("\n menu :");
            System.out.println("1.\ttampilkan data");
            System.out.println("2.\ttambah data");
            System.out.println("3.\tubah data");
            System.out.println("4.\thapus data");
            System.out.println("5.\tcari data");
            System.out.println("\n\n pilihan anda:");
            optionUser=termiScanner.next();

        switch (optionUser) {
            case "1":
            tampilkandata();
            break;
            case "2":
            tambahkandata();
            break;
            case "3":
            ubahdata();
            break;
            case "4":
            hapusdata();
            break;
            case "5":
            cariDataBuku();
            break;
            
            default:
            System.err.print("\npilihan anda tidak ada dalam menu\n silahkan pilih menu 1-4");
            break;
        }
        isLajutkan=fungsiLanjut("Apakah anda ingin melanjutkan?");
    }
    
}
private static void tampilkandata() throws IOException {
    System.out.println("ini tampilkan data");
    FileReader rFileReader;
    BufferedReader bReader;
   // FileReader reader= new FileReader("database.txt");
    //BufferedReader bReader=new BufferedReader(reader);
    //System.out.println(bReader.readLine());
    //System.out.println(bReader.readLine());
    //System.out.println(bReader.readLine());
    //System.out.println(bReader.readLine());
    //System.out.println(bReader.readLine());

    try {
        rFileReader=new FileReader("database.txt");
        bReader=new BufferedReader(rFileReader);
    } catch (Exception e) {
      System.err.println(e);
      return;
    }
   
    String data=bReader.readLine();
    while (data!=null) {
    StringTokenizer sTokenizer=new StringTokenizer(data,",");
    System.out.println(sTokenizer.nextToken());
    System.out.println(sTokenizer.nextToken());
    System.out.println(sTokenizer.nextToken());
    System.out.println(sTokenizer.nextToken());
    data=bReader.readLine();
    
}
    
} private static void hapusdata() {
    System.out.println("ini hapus data");
}private static void tambahkandata() {
    System.out.println("ini tambahkan data");
}private static void ubahdata() {
    System.out.println("ini ubahdata");
    
}private static void cariDataBuku() {
    System.out.println("cari data buku:");
}private static boolean fungsiLanjut(String message) {
    Scanner termiScanner=new Scanner(System.in);
   
    System.out.print("\n"+message+"y/n?");
   String optionUser=termiScanner.next();
    while (!optionUser.equalsIgnoreCase("y") && !optionUser.equalsIgnoreCase("n")) {
        System.err.println("pilihan anda bukan y atau n");
        optionUser=termiScanner.next();
    
}

return optionUser.equalsIgnoreCase("y");
    
}
private static void clearScreen() {
    try {
        if (System.getProperty("os.name").contains("windows")) {
            new ProcessBuilder("cmd","/c","cls").inheritIO();
            } else {
                System.out.print("\003\143");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}


