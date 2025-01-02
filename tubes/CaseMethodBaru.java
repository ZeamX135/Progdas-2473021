
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Case Method 1 [TUBES] Byte Collection
 *
 * @author 2473012-Kenneth Hansel
 * @author 2473018-Joshua Lewi
 * @author 2473021-Febrianus Leona Putra
 * @version 29 Okt 2024
 */
public class CaseMethodBaru {

    private static String pilihKasir(Scanner sc) {
        System.out.println("======================================================");
        System.out.println("Pilih Kasir:");
        System.out.println("1. Kasir 1");
        System.out.println("2. Kasir 2");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihanKasir = sc.nextInt();
        if (pilihanKasir == 1) {
            return "Kasir 1";
        } else if (pilihanKasir == 2) {
            return "Kasir 2";
        } else {
            return "Kasir Tidak Dikenal";
        }
    }

    private static int pilihProduk(Scanner sc) {
        System.out.println("======================================================");
        System.out.println("Pilih Produk:");
        System.out.println("1. Kaos Polos");
        System.out.println("2. Kaos Kerah");
        System.out.println("3. Kemeja Lengan Panjang");
        System.out.println("4. Kemeja Lengan Pendek");
        System.out.println("5. Hoodie");
        System.out.println("6. Jaket");
        System.out.print("Masukkan pilihan (1-6): ");
        return sc.nextInt();
    }

    private static void handleSizing(
            int main_pilihan, Scanner sc, ArrayList<String> daftar_bajuReal, ArrayList<String> size_bajuReal,
            ArrayList<Integer> harga_bajuReal, String[] daftar_baju1, String[] size_baju1,
            int[] harga_baju1, int[] harga_baju2, int[] harga_baju3, int[] harga_baju4, int[] harga_baju5) {

        daftar_bajuReal.add(daftar_baju1[main_pilihan - 1]);
        System.out.println("Pilih ukuran:");
        for (int i = 0; i < size_baju1.length; i++) {
            System.out.println((i + 1) + ". " + size_baju1[i]);
        }
        System.out.print("Masukkan pilihan ukuran (1-" + size_baju1.length + "): ");
        int size_pilihan = sc.nextInt();
        size_bajuReal.add(size_baju1[size_pilihan - 1]);

        int harga = 0;
        switch (main_pilihan) {
            case 1 ->
                harga = harga_baju1[size_pilihan - 1];
            case 2 ->
                harga = harga_baju2[size_pilihan - 1];
            case 3 ->
                harga = harga_baju3[size_pilihan - 1];
            case 4 ->
                harga = harga_baju4[size_pilihan - 1];
            case 5 ->
                harga = harga_baju5[size_pilihan - 1];
        }
        harga_bajuReal.add(harga);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime tgl_tanggal = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String tanggal = tgl_tanggal.format(format1);
        String waktu = tgl_tanggal.format(format2);
        int main_pilihan, jumlah, tipePembayaran;
        int tunai = 0;
        int biaya_adm = 0;
        String tipePembayaran_real = "";
        String[] daftar_baju1 = {"Kaos Polos", "Kaos Kerah", "Kemeja Lengan Panjang", "Kemeja Lengan Pendek", "Hoodie", "Jaket"};
        String[] size_baju1 = {"XS", "S", "M", "L", "XL", "XXL", "3XL"};
        int[] harga_baju1 = {50000, 55000, 60000, 66000};
        int[] harga_baju2 = {94000, 96000, 100000, 107000};
        int[] harga_baju3 = {150000, 152000, 160000, 170000, 177000, 179000, 185000};
        int[] harga_baju4 = {250000, 260000, 270000, 290000, 300000};
        int[] harga_baju5 = {190000, 195000, 201000, 206000, 210000};
        ArrayList<String> daftar_bajuReal = new ArrayList<>();
        ArrayList<String> size_bajuReal = new ArrayList<>();
        ArrayList<Integer> harga_bajuReal = new ArrayList<>();
        ArrayList<Integer> jumlah_bajuReal = new ArrayList<>();

        String namaKasir = pilihKasir(sc);
        System.out.println("\n======================================================");

        String yesno;
        do {
            main_pilihan = pilihProduk(sc);
            handleSizing(main_pilihan, sc, daftar_bajuReal, size_bajuReal, harga_bajuReal, daftar_baju1, size_baju1, harga_baju1, harga_baju2, harga_baju3, harga_baju4, harga_baju5);
            System.out.print("Masukkan jumlah item: ");
            jumlah = sc.nextInt();
            jumlah_bajuReal.add(jumlah);
            System.out.print("Apakah Anda ingin menambah item? (Y/N): ");
            yesno = sc.next();
        } while (yesno.equalsIgnoreCase("y"));

        int subtotal1 = hitungSubtotal(daftar_bajuReal, harga_bajuReal, jumlah_bajuReal);

        tipePembayaran = pilihPembayaran(sc);
        if (tipePembayaran == 1) {
            tunai = handleTunai(sc, subtotal1);
            tipePembayaran_real = "Tunai";
        } else {
            biaya_adm = 1000;
            tipePembayaran_real = "Non-Tunai";
        }

        cetakStruk(tanggal, waktu, namaKasir, daftar_bajuReal, size_bajuReal, harga_bajuReal, jumlah_bajuReal, subtotal1, biaya_adm, tipePembayaran_real, tunai);
    }

    private static int hitungSubtotal(ArrayList<String> daftar, ArrayList<Integer> harga, ArrayList<Integer> jumlah) {
        int subtotal = 0;
        for (int i = 0; i < daftar.size(); i++) {
            subtotal += harga.get(i) * jumlah.get(i);
        }
        return subtotal;
    }

    private static int pilihPembayaran(Scanner sc) {
        System.out.println("======================================================");
        System.out.println("1. Tunai");
        System.out.println("2. Non-Tunai");
        System.out.print("Masukkan tipe pembayaran (1/2): ");
        return sc.nextInt();
    }

    private static int handleTunai(Scanner sc, int subtotal) {
        int tunai;
        do {
            System.out.print("Masukkan tunai (Rp): ");
            tunai = sc.nextInt();
        } while (tunai < subtotal);
        return tunai;
    }

    private static void cetakStruk(String tanggal, String waktu, String kasir, ArrayList<String> daftar, ArrayList<String> size, ArrayList<Integer> harga, ArrayList<Integer> jumlah, int subtotal, int biaya_adm, String tipePembayaran, int tunai) {
        System.out.println("\n\n======================================================");
        System.out.println("================= BYTE COLLECTION ====================");
        System.out.println("  Jl. Surya Sumantri No.65, Sukawarna, Kota Bandung   ");
        System.out.println("======================================================");
        System.out.println("Tanggal\t: " + tanggal);
        System.out.println("Waktu\t: " + waktu);
        System.out.println("Kasir\t: " + kasir);
        System.out.println("======================================================");
        int total = subtotal + biaya_adm;
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println(daftar.get(i) + "(" + size.get(i) + ")");
            System.out.println(jumlah.get(i) + "x Rp" + harga.get(i) + "\t\t: Rp" + (jumlah.get(i) * harga.get(i)) + "\n");
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Subtotal\t\t: Rp" + subtotal);
        System.out.println("Biaya ADM\t\t: Rp" + biaya_adm);
        System.out.println("Total\t\t\t: Rp" + total);
        if (tipePembayaran.equals("Tunai") && total < tunai) {
            System.out.println("Kembalian\t\t: Rp" + (tunai - total));
        }
        System.out.println("======================================================");
        System.out.println("=========== TERIMA KASIH TELAH BERBELANJA! ===========");
        System.out.println("======================================================");
    }
}
