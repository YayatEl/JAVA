import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;

public class bufferedbyte {
    public static void main(String[] args)throws IOException {
        FileInputStream bytestreaminput= new FileInputStream("input.txt");
        //BufferedInputStream fileinput=new BufferedInputStream("input.txt");
        System.out.println(bytestreaminput.available());
        long waktuStart,waktuFinish;
        System.out.println(bytestreaminput.readAllBytes());
        bytestreaminput.close();
        FileInputStream byteinput2=new FileInputStream("input.txt");
        BufferedInputStream iStream= new BufferedInputStream(byteinput2);
        System.out.println(iStream.available());
        iStream.mark(200);
        waktuStart=System.nanoTime();
        System.out.println(iStream.readAllBytes());
        waktuFinish=System.nanoTime();
        System.out.println(waktuFinish-waktuStart);
//buffered lebih cepat karena disimpan dimemory dan bisa direset agar bisa diabaca lagi
       iStream.reset();
        byte[] data=iStream.readAllBytes();
        String datastring=new String(data);
        System.out.println(datastring);
        //menulis dengan buffered output flush
      //  BufferedWriter bufwrite=new BufferedWriter("outputbuffer.txt");
      FileOutputStream outputfile=new FileOutputStream("outputbuffer.txt");
      BufferedOutputStream outputbufs= new BufferedOutputStream(outputfile);

      outputbufs.write(data,0, data.length);
      outputbufs.flush();
      outputbufs.close();
      bytestreaminput.close();
      byteinput2.close();
      iStream.close();
    }
}
