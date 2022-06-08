public class operatorbitwise {
   
    public static void main(String[] args) {
        //operator bitwise operator dalam bentuk bit
        //8-bit= 1 byte

byte a=1;
byte b,c;

String a_bits;
String b_bits, c_bits;
a_bits=String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
System.out.printf("%s=%d \n",a_bits,a);
//operator shift left

b=(byte)(a<<2);
b_bits=String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
System.out.printf("%s=%d \n",b_bits,b);

//operator bitwise or
c=(byte)(a&b);
c_bits=String.format("%8s",Integer.toBinaryString(c)).replace(' ', '0');
System.out.printf("%s=%d \n",c_bits,c);
}    
        
    }

