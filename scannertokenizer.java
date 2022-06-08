import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class scannertokenizer {
    public static void main(String[] args)throws IOException {
    Scanner scanner=new Scanner(System.in);
    System.out.println("masukkan input");
    String input=scanner.next();
    System.out.println(input);
    input=scanner.next();
    System.out.println(input);
    FileReader fReader=new FileReader("input2.txt");

    BufferedReader bReader=new BufferedReader(fReader);
    Scanner scanner2=new Scanner(bReader);
    //System.out.println((char)bReader.read());
    //BufferedReader
    bReader.mark(200);
   // System.out.println(scanner2.hasNext());
    scanner2.useDelimiter(",");
   // System.out.println(scanner2.next());
    //System.out.println(scanner2.next());
    //System.out.println(scanner2.next());
    //System.out.println(scanner2.next());
    //System.out.println(scanner2.next());
    //System.out.println(scanner2.hasNext());
    //menggunakan delimiter tertentu
    while (scanner2.hasNext()) {
        System.out.println(scanner2.next());

        
    }
    //tokenizer
    bReader.reset();
    String data=bReader.readLine();
    System.out.println(data);
StringTokenizer tokenizer=new StringTokenizer(data,",");

System.out.println(tokenizer);
while (tokenizer.hasMoreTokens()) {
    System.out.println(tokenizer.nextToken());
    
}
    
}
}
