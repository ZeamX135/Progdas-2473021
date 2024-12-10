
/**
 * Pertemuan 11
 * [PR] Program untuk mengelola data pegawai
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 06 Desember 2024
 */
import java.util.ArrayList;
import java.util.Scanner;

public class C_DataPegawai {

    private static ArrayList<Pegawai> dataPegawai = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    static class Pegawai {

        String nama;
        String jabatan;
        int gaji;

        Pegawai(String nama, String jabatan, int gaji) {
            this.nama = nama;
            this.jabatan = jabatan;
            this.gaji = gaji;
        }
    }

    private static void tambahPegawai() {
        System.out.print("Masukkan nama pegawai: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan jabatan: ");
        String jabatan = sc.nextLine();

        int gaji = -1;
        boolean validGaji = false;

        while (!validGaji) {
            System.out.print("Masukkan gaji: ");
            String inputGaji = sc.nextLine();

            if (isNumeric(inputGaji)) {
                gaji = Integer.parseInt(inputGaji);
                validGaji = true;
            } else {
                System.out.println("Gaji harus berupa angka. Silakan coba lagi.");
            }
        }

        dataPegawai.add(new Pegawai(nama, jabatan, gaji));
        System.out.println("Pegawai berhasil ditambahkan!");
    }

    private static void tampilPegawai() {
        if (dataPegawai.isEmpty()) {
            System.out.println("Belum ada data pegawai.");
            return;
        }

        System.out.println("\nDaftar Pegawai:");
        System.out.printf("%-5s%-10s%-10s%-10s%n", "No", "Nama", "Jabatan", "Gaji");

        for (int i = 0; i < dataPegawai.size(); i++) {
            Pegawai pegawai = dataPegawai.get(i);
            System.out.printf("%-5d%-10s%-10s%-10d%n",
                    i + 1,
                    pegawai.nama,
                    pegawai.jabatan,
                    pegawai.gaji
            );
        }
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu Pengelolaan Data Pegawai:");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Tampilkan Daftar Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    tambahPegawai();
                    break;
                case "2":
                    tampilPegawai();
                    break;
                case "3":
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
