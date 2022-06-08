public class methodvoid {
    public static void main(String[] args) {
        //void itu hampa tipe data kosong

simple();
System.out.println(simple());
name("joni");
fungsivoid("apapun");
selamatpagi("abah");
selamatpagi("emak");
    }
//ini dfungsi dengan method dengan kembalian sehingga menggunakan return makanya menggunakan return
private static float simple() {
   
    return 10.01f;
}

private static String name(String nama) {
    return nama;
}
private static void selamatpagi(String nama) {
    System.out.println("selamat pagi"+nama);
}
//tanpa kembalian
private static void fungsivoid(String input) {
    System.out.println(input);
}
}