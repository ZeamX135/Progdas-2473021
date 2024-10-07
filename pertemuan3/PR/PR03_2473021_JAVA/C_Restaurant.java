/**
 * Pertemuan 03
 * [PR] Membuat program yang akan memberikan struk dari pesanan yang diinput oleh user dari berbagai jenis menu restaurant yang disediakan.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 7 Oktober 2024
 */
package pertemuan3.PR.PR03_2473021_JAVA;

import java.util.Scanner;

public class C_Restaurant {

    public static void tampilkanMenu() {
        System.out.println("MENU:");
        System.out.println("1. Nasi Java    - Rp 25000");
        System.out.println("2. Mie Python   - Rp 15000");
        System.out.println("3. Ayam PHP     - Rp 20000");
        System.out.println("4. Sate Coding  - Rp 30000");
        System.out.println("5. Es Teh HTML  - Rp 7500");
    }

    public static int hitungHarga(int pilihan) {
        if (pilihan == 1) {
            return 25000;
        } else if (pilihan == 2) {
            return 15000;
        } else if (pilihan == 3) {
            return 20000;
        } else if (pilihan == 4) {
            return 30000;
        } else if (pilihan == 5) {
            return 7500;
        } else {
            return 0;
        }
    }

    public static String namaMenu(int pilihan) {
        if (pilihan == 1) {
            return "Nasi Java";
        } else if (pilihan == 2) {
            return "Mie Python";
        } else if (pilihan == 3) {
            return "Ayam PHP";
        } else if (pilihan == 4) {
            return "Sate Coding";
        } else if (pilihan == 5) {
            return "Es Teh HTML";
        } else {
            return "Menu Tidak Valid";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int pilihan, totalHarga = 0, tambahan, hargaTambahan = 0;
        String pesananUtama, pesananTambahan = "";
        int potonganAwal = 0;
        char adaTambahan;
        String kodeVoucher;

        System.out.print("Input nama: ");
        nama = input.nextLine();
        System.out.println("======================");

        System.out.println("WELCOME TO PROGDAS RESTAURANT!");
        tampilkanMenu();

        System.out.print("pilihan Anda : ");
        pilihan = input.nextInt();
        pesananUtama = namaMenu(pilihan);
        totalHarga += hitungHarga(pilihan);

        System.out.print("Apakah ada tambahan pesanan? (Y/N): ");
        adaTambahan = input.next().charAt(0);

        if (adaTambahan == 'Y' || adaTambahan == 'y') {
            System.out.print("Tambahan Pesanan : ");
            tambahan = input.nextInt();
            pesananTambahan = namaMenu(tambahan);
            hargaTambahan = hitungHarga(tambahan);
            totalHarga += hargaTambahan;
        }
        System.out.println("===========================");

        System.out.print("Masukkan Kode Voucher: ");
        kodeVoucher = input.next();
        System.out.println("==============================================");

        String voucher = "PEMROGRAMANDASAR";
        int potongan = 2500;
        if (kodeVoucher.equals(voucher)) {
            System.out.println("Selamat Anda mendapatkan potongan sebesar Rp " + potongan + "!");
            potonganAwal = potongan;
            totalHarga -= potonganAwal;
        } else {
            System.out.println("Voucher yang anda input tidak berlaku");
        }

        System.out.println("\n----------------- STRUK ----------------");
        System.out.println("Nama		: " + nama);
        System.out.print("Jenis Pesanan	: " + pesananUtama);
        if (!pesananTambahan.isEmpty()) {
            System.out.println(" dan " + pesananTambahan);
        } else {
            System.out.println();
        }
        System.out.println("Total Pesanan	: Rp " + (hitungHarga(pilihan) + hargaTambahan));
        System.out.println("Potongan	: Rp " + potongan);
        System.out.println("Total Harga	: Rp " + totalHarga);
        System.out.println("------------------------------------");

        input.close();
    }
}
