public class operatorunary {
    
    public static void main(String[] args) {
        int angka=1;
        System.out.println("ini adalaha unary minus:"+-angka);

        //increament
        int angka2=10;
        ++angka2;//prefix
        angka2++;//postfix ini akan dipanggil dulu baru dijumlahkan
        System.out.printf("ini adalah angka increament: %d \n", angka2);
        //decrement
        int angka3=20;
        --angka3;
        System.out.printf("ini adalah angka decreamentt: %d berkurang -1 %d \n", angka3, --angka3);
        boolean yayat=true;
        System.out.printf("ini adalah nilai unary bool:  \n"+!yayat);

}
}
