import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.Arrays;
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
      tambahkandata();
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
    
} private static void hapusdata() throws IOException{
    System.out.println("ini hapus data");
    delete();
}
private static void tambahkandata()throws IOException {
    Scanner tScanner=new Scanner(System.in);
    System.out.println("ini tambahkan data");
    FileWriter inputdWriter=new FileWriter("database.txt",true);
    BufferedWriter bWriter=new BufferedWriter(inputdWriter);
  String penulis,judul,tahun,penerbit;
  System.out.println("masukkan penulis:");
  penulis=tScanner.nextLine();
  System.out.println("masukkan judul:");
  judul=tScanner.nextLine();
  System.out.println("masukkan tahun:");
  tahun=tScanner.nextLine();
  tahuncek(tahun);
 System.out.println("masukkan penerbit:");
  penerbit=tScanner.nextLine();

String[] keywords={tahun+","+penulis+","+penerbit+","+judul};
System.out.println(Arrays.toString(keywords));
boolean isExist=cekBuku(keywords, false);
//System.out.println(isExist);
if (!isExist) {
 // bWriter.write(keywords, inputdWriter, inputdWriter.le);
 long noEntry=1;
String penulistanpaspasi= penulis.replaceAll("\\s+","");
String primaryKey=penulistanpaspasi+"_"+tahun+"_"+noEntry;
boolean isTambah=fungsiLanjut("apakah anda ingin lanjut?");
if (isTambah) {
   bWriter.write(primaryKey+","+tahun+","+penulis+","+penerbit+","+judul);
   bWriter.newLine();
   bWriter.flush();
}else{}
}else{ 
System.out.println("buka anda sudah ada");
cekBuku(keywords, true);
}
bWriter.close();

}
private static String tahuncek(String tahun) {
    Scanner tScanner=new Scanner(System.in);
    //System.out.println("masukkan tahun:");
   // tahun=tScanner.nextLine();
    boolean tahunvalid=false;
    while (!tahunvalid) {
      try {
          Year.parse(tahun);
          tahunvalid=true;
          
      } catch (Exception e) {
          System.err.println("tahun salah");
         System.out.println("masukkan tahun:");
    tahun=tScanner.nextLine();
      }
    }return tahun;
}
private static void ubahdata() {
    System.out.println("ini ubahdata");
    
}
private static void caridata()throws IOException {
    //membaca datatabse
 
    //BufferedReader bReader=new BufferedReader(reader);
    //mengambil input user
    //cek database
    try {
      File reader=new File("database.txt");
        
    } catch (Exception e) {
        System.err.println(e);
        return;
    }
    Scanner inputTerminal= new Scanner(System.in);
    System.out.println("silahakan masukkan kata pencarian:");
    String kataPencarian= inputTerminal.nextLine();
   // System.out.println(kataPencarian);
    String[] arrayString=kataPencarian.split("\\s+"); 
   
cekBuku(arrayString,true);
    

}
private static boolean cekBuku(String[] keywords, boolean isDisplay)throws IOException {
boolean isExist=false;
FileReader fileInput=new FileReader("database.txt");
BufferedReader bufferedReader=new BufferedReader(fileInput);
String data= bufferedReader.readLine();
int jumlahData=0;
//isExist=false;
System.out.println("===========================================");
while (data!=null) {
    isExist=true;
    jumlahData++;
    //System.out.println(jumlahData);
    //System.out.println(data);
    //  System.out.println(Arrays.toString(keywords));
    for (String keyword : keywords) {
        isExist=isExist && data.toLowerCase().contains(keyword.toLowerCase());
    }
    // System.out.println(isExist);
    if (isExist) {
        if (isDisplay) {
            
            System.out.println(data);
        }else{
break;
        }
        //System.out.println(isExist);
    }
    data=bufferedReader.readLine();
}
System.out.println("===========================================");
return isExist;


}
private static void cariDataBuku() throws IOException {
    System.out.println("cari data buku:");
    caridata();
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

    private static void delete()throws IOException {
        File databasFile=new File("database.txt");
        FileReader dFileReader=new FileReader(databasFile);
        BufferedReader dBufferedReader=new BufferedReader(dFileReader);
        File tempDatabase=new File("tempDatabase.txt");
        FileWriter fWriter=new FileWriter(tempDatabase);
        BufferedWriter bufferedWriter=new BufferedWriter(fWriter);
        tampilkandata();
Scanner dScanner=new Scanner(System.in);
System.out.println("masukkan nomor yang ingin di delete");
int deleteNum=dScanner.nextInt();
int countData=0;
String bacaData= dBufferedReader.readLine();
while (bacaData!=null) {
    countData++;
    boolean isDelete=false;
if (deleteNum==countData) {
    System.out.println(bacaData);
}
bacaData=dBufferedReader.readLine();
    
}


        
}
}


