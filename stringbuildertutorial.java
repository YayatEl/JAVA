import java.lang.module.ModuleDescriptor.Builder;

public class stringbuildertutorial {
    public static void main(String[] args) {
        StringBuilder sBuilder=new StringBuilder("halo");
    
        System.out.println(sBuilder.capacity());
        System.out.println("panjang :"+sBuilder.length());
        //append tidak membuat address baru
     
        printFungsi(sBuilder.append("halo semuanya"));
        //insert
        sBuilder.insert(5, "bandung");
        printFungsi(sBuilder);
        //delete
        sBuilder.delete(1, 5);
        printFungsi(sBuilder);
        //mengubah index
        sBuilder.setCharAt(6, 'Z');
        printFungsi(sBuilder);
        //replace
        sBuilder.replace(1, 5, "jogja");
        printFungsi(sBuilder);
        //casting menjadi string
        String kalimat=sBuilder.toString();
        int addresstring2= System.identityHashCode(kalimat);
        System.out.println(kalimat);
        System.out.println(addresstring2);

    }
    private static void printFungsi(StringBuilder dString) {
        int addresstring=System.identityHashCode(dString);
        System.out.println(dString);
        System.out.println(addresstring);
    }
}
