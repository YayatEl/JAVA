import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charstreamex {
    public static void main(String[] args) throws IOException {
        FileInputStream ByteinputFile=new FileInputStream("input.txt");
        FileReader cFileReader=new FileReader("input.txt");
        FileWriter charoutput=new FileWriter("outputchar.txt");
//buffer=cFileReader.read();
  System.out.println(ByteinputFile.read());
  System.out.println(cFileReader.read());

  System.out.println((char)ByteinputFile.read());
 // System.out.println((char)CharinputFile.read());

  //CharinputFile.close();

int buffer = cFileReader.read();
  while(buffer!=-1){
      System.out.print((char)buffer);
charoutput.write(buffer);
buffer=cFileReader.read();

  }

  ByteinputFile.close();
  cFileReader.close();
  charoutput.close();
    }
}
