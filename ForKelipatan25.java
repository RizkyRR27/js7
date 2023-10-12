import java.util.Scanner;
public class ForKelipatan25 {

    public static void main(String[] args) {
        Scanner scan25 = new Scanner(System.in);

        int Kelipatan, jumlah = 0, counter = 0;
        double ratarata;
        
        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        Kelipatan = scan25.nextInt();
        

        for (int i = 1; i <= 50; i++) {
            if (i % Kelipatan == 0) {
                jumlah += i;
                counter++;


            }
        }    
        if (counter > 0)
        ratarata = (double) jumlah/counter;
        
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", Kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", Kelipatan, jumlah);
    System.out.printf("rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", jumlah,counter);
            }

}