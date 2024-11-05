
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Case Method 1 [Nama Toko]
 *
 * @author 2473012-Kenneth Hansel
 * @author 2473018-Joshua Lewi
 * @author 2473021-Febrianus Leona Putra
 * @version 22 Okt 2024
 */
public class struk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaKasir = "Joshua Lewi";
        String produk1 = "Kaos";
        String ukuran1 = "XL";
        int harga1 = 50000;
        String produk2 = "Hoodie";
        String ukuran2 = "L";
        int harga2 = 250000;
        int subtotal = harga1 + harga2;
        // Total nanti jadi harga akhir(setelah didiskon, dll)
        int total = subtotal;
        String tipePembayaran = "Cash";

        LocalDateTime tgl_tanggal = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yy\nhh:mm:ss");
        String tanggal = tgl_tanggal.format(format);
        System.out.println("======================================================");
        System.out.println("================= BYTE COLLECTION ====================");
        System.out.println("  Jl. Surya Sumantri No.65, Sukawarna, Kota Bandung   ");
        System.out.println("======================================================");
        System.out.println(tanggal);
        System.out.println("Kasir : " + namaKasir);
        System.out.println("======================================================");
        System.out.println(produk1);
        // Hitung jumlah produk yang dipilih
        System.out.println("1 x " + harga1 + "                                      Rp" + harga1);
        System.out.println(produk2);
        // Hitung jumlah produk yang dipilih
        System.out.println("1 x " + harga2 + "                                    Rp" + harga2);
        System.out.println("======================================================");
        System.out.println("Subtotal        : Rp" + subtotal);
        System.out.println("Total           : Rp" + total);
        System.out.println("Bayar (" + tipePembayaran + ")    : ........");
        // Kalo cash ada kembalian
        System.out.println("Kembalian       : .....");
    }
}
