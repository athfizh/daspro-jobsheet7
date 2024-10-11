import java.util.Scanner;
public class TugasBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 50000, jumlahTiket, totalHarga, i = 1, pendapatanHarian = 0, totalTiket = 0; 
        double hargaDiskon = 0; 
 
        System.out.println("-------------------PENGHITUNGAN TIKET BIOSKOP-------------------"); 
        System.out.println("*Ketik 0 untuk keluar dari program"); 
        System.out.println("----------------------------------------------------------------"); 
        
        do { 
            System.out.print("Masukkan jumlah tiket pelanggan ke " + i + " : "); 
            jumlahTiket = sc.nextInt(); 
 
            if (jumlahTiket < 0) { 
                System.out.println("Nilai tidak valid. Masukkan ulang jumlah tiket"); 
                continue; 
            } else if (jumlahTiket == 0) { 
                continue; 
            }
            totalHarga = jumlahTiket * harga; 
            System.out.println("Total harga : Rp " + totalHarga); 
 
            if (jumlahTiket > 4 && jumlahTiket <= 10) { 
                hargaDiskon = totalHarga - (totalHarga * 0.1); 
                System.out.println("Diskon 10% menjadi : Rp " + hargaDiskon); 
            } else if (jumlahTiket > 10) { 
                hargaDiskon = totalHarga - (0.15 * totalHarga); 
                System.out.println("Diskon 15% menjadi : Rp " + hargaDiskon); 
            } else { 
                hargaDiskon = totalHarga; 
            } 
 
            pendapatanHarian += hargaDiskon; 
            totalTiket += jumlahTiket;
            
            i++; 
            
        } while (jumlahTiket != 0); 
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total tiket terjual sehari : " + totalTiket);
        System.out.println("Total harga penjualan tiket sehari : Rp " + pendapatanHarian); 
        System.out.println("----------------------------------------------------------------");      
    } 
} 