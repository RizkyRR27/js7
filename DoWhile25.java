import java.util.Scanner;
public class DoWhile25 {
    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        int jatahCuti, jmlHari;
        String Konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan25.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t) : ");
            Konfirmasi = scan25.next();
            
            if (Konfirmasi.equalsIgnoreCase("y")){
                System.out.println("jumlah hari");
                jmlHari = scan25.nextInt();
                if (jmlHari <= jatahCuti) {
                jatahCuti -= jmlHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
                }
             else {
             System.out.println("Sisa jatah cuti anda tidak mencukupi, coba deh masukin lagi!");
    continue;
            }
        } 

        
        
        
    }
 while (jatahCuti > 0);

} 
}



