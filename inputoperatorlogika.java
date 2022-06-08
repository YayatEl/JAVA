import java.util.Scanner;

import javax.security.sasl.SaslException;

public class inputoperatorlogika {
    public static void main(String[] args) {
        int nilaitebakan,nilibenar;
        boolean statustebakan;
        Scanner inputuser= new Scanner(System.in);
nilibenar=6;
System.out.println("masukkan nilai tebakan anda:");
nilaitebakan=inputuser.nextInt();
 statustebakan=nilibenar==nilaitebakan;       
System.out.println("tebakan anda :"+ statustebakan);    
}
}
