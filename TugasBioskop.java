import java.util.Scanner;
public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket;
        double diskon, hargaTiket = 50000, totalHarga;

        do {
            System.out.print("Masukkan jumlah tiket terjual: ");
            jmlTiket = sc.nextInt();
            if (jmlTiket < 0) 
            {
                System.out.println("Jumlah tiket tidak valid. Silahkan input ulang!");
            }
            if (jmlTiket > 4) 
            {
            diskon = 0.1;
            } else if (jmlTiket > 10) {
            diskon = 0.15;
            } else {
            diskon = 0;
        }
       
    } while (jmlTiket < 0);
    totalHarga = jmlTiket * hargaTiket;
    System.out.println("Total tiket: " + jmlTiket);
    System.out.println("Total harga: Rp " + totalHarga);
    System.out.println("Total harga setelah diskon: Rp " + (totalHarga - (totalHarga * diskon)));
}
}