import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class bufferchar {
    public static void main(String[] args)throws IOException {
        //membaca file
        FileReader fileread=new FileReader("input.txt");
        BufferedReader bReader=new BufferedReader(fileread);
        bReader.mark(200);

        String data=bReader.readLine();
        System.out.println(data);
        System.out.println(bReader.readLine());

        bReader.reset();
        //membaca kedalam karakter
        char[] datachar=new char[50];
        bReader.read(datachar, 0, 50);
        System.out.println(Arrays.toString(datachar));
        bReader.reset();
        //membaca perkarakter
        System.out.println((char)bReader.read());
        //menulis
        FileWriter fWriter=new FileWriter("outpubuf.txt");
        BufferedWriter bWriter=new BufferedWriter(fWriter);

        String baris1= bReader.readLine();
        String baris2= bReader.readLine();
        bWriter.write(baris1);
        bWriter.newLine();
        bWriter.write(baris2, 0, baris2.length());;

        bWriter.flush();
  

        
    }
}
