import java.util.Formatter;

public class formatString {
    public static void main(String[] args) {
        String nama="budi";
        int umur=20;
        PrintString(nama,umur);
        System.out.printf("%1$s sedang makan, %1$s habis makan dan umur budi %2$d \n",nama,umur);
        //flags
        int int4=100000000;
        int int1=3;
        int int2=8;
        int hasil=int1+int2+10000;
        System.out.printf("%d + %d= %+d \n",int1,int2,hasil);
        //witdh
        System.out.printf("%d + %d= %+10d \n",int1,int2,hasil);
        System.out.printf("%d + %d= %-10d\n",int1,int2,hasil);
        System.out.printf("%d + %d= %+-10d\n",int1,int2,hasil);
        System.out.printf("%d + %d= %010d\n",int1,int2,hasil);
        System.out.printf("%d + %d= %,10d\n",int1,int2,hasil);
        System.out.printf("%-,15d\n",int4);
        //floating point
        float float1=1.354f;
        System.out.printf("%10f\n",float1);

        //precision
        float float2=1.23445678f;
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        //example
        String nama2="aditua";
        float ipk= 3.89f;
        System.out.printf("nama saya adalah : %s dan ipk %.1f \n", nama2,ipk);
        //save kedalam informasi string
        String info="nama mahasiswa ="+nama2+" ipk mahasiswa="+ipk+ "\n";

System.out.println(info);
String info_format=String.format("nama saya adalah : %s dan ipk %.1f \n", nama2,ipk);
System.out.println(info_format);
StringBuilder bStringBuilder=new StringBuilder();
Formatter formatString=new Formatter(bStringBuilder);
formatString.format("nama saya adalah : %s dan ipk %.1f \n", nama2,ipk);
System.out.println("string builder format-->" +formatString);

    }
    private static void PrintString(String dsString, int dint) {
        System.out.println(dsString);
        System.out.printf("nama saya adalah : %s dan umur saya %d \n", dsString,dint);
    //f=float s=string b=boolean d=integer c=characther
    //struktur format convertion
    //format=%[argumen_index$][flags][width][.precision]

    //argumen index$
    }
}
