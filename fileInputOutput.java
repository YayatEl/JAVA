import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class fileInputOutput {
    public static void main(String[] args)throws IOException {
        FileInputStream fileInput,fileInput2=null;
        FileOutputStream fileOutput=null;
        fileInput=new FileInputStream("input.txt");
      //  System.out.println(fileInput.read());
       // fileInput.close();
      //  fileInput=new FileInputStream("input2.txt");
        //System.out.println(fileInput.read());
       // fileInputStream2=new FileInputStream("input2.txt");
        //System.out.println(fileInputStream2.read());
int data=fileInput.read();
while (data!=-1) {
    System.out.println((char)data);
    data=fileInput.read();
}

fileInput.close();

try {
    fileInput=new FileInputStream("input2.txt");
    fileOutput=new FileOutputStream("Output.txt");
    int buFfer=fileInput.read();
    while (buFfer!=-1) {
        fileOutput.write(buFfer);
        buFfer=fileInput.read();
    }

}finally{
    if (fileInput!=null) {
        fileInput.close();
    }
    if (fileOutput!=null) {
        fileOutput.close();
    }

}

try (FileInputStream in=new FileInputStream("input2.txt");
FileOutputStream fileOutput2=new FileOutputStream("Output2.txt");) {
    int data2=in.read();
while (data2!=-1) {
    fileOutput2.write(data2);
    System.out.println((char)data2);
    data2=in.read();
}
}
    }
}
