public class breakcontinue {
    public static void main(String[] args) {
        //break continue, dan return
        int a=0;
        while (true) {
            a++;
             System.out.println("ini nilai ke- "+ a);
            if (a==10) {
                break;// keluar dari loop
            }else if (a==5) {
                continue;// memulai aksi dari awal
            }else if (a==7) {
                return;
            } 
            //System.out.println("ini nilai ke- "+ a);
            // break;
      
        }
    }

}
