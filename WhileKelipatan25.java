import java.util.Scanner;
public class WhileKelipatan25 {
   public static void main(String[] args) {
    Scanner scan25 = new Scanner(System.in);

 int kelipatan, jumlah = 0, counter = 0;
 double ratarata;
 
 System.out.println("Masukan bilangan kelipatan dari (1-9): ");
 kelipatan = scan25.nextInt();

 int i=1;
 while (i <=50 ) {
    if (i % kelipatan == 0) {

    jumlah +=i;
    counter ++;
 }
 i++;
   } ratarata = (double) jumlah/counter;
   System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
   System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
System.out.printf("rata rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", jumlah,counter);
}
}