import java.util.Scanner;
public class WhileGaji25 {
    
    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        int jmlKaryawan, jmlJamLembur;
        double gajiLembur = 0, ttlGajiLembur = 0;
        String jabatan;

        System.out.print("Masukan jumlah karyawan: ");
        jmlKaryawan = scan25.nextInt();

        int i = 0;

        while (i < jmlKaryawan ) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.println("Masukan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan25.next();
            System.out.println("Masukan jumlah jam lembur: ");
            jmlJamLembur = scan25.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
                

            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jmlJamLembur * 100000;

            }else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jmlJamLembur * 75000;

            } else {
                System.out.println("Jabatan invalid");
                i--;
            }
            ttlGajiLembur += gajiLembur;

        }
        System.out.println("Total gaji lembur: " + ttlGajiLembur);
    }

}
