
/**
 * Pertemuan 11
 * [PR] Sebuah program menggunakan fungsi dan prosedur untuk menganalisis data nilai mahasiswa.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 06 Desember 2024
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Statistik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        // Input nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa.add(sc.nextInt());
        }

        // Analisis nilai
        int nilaiTertinggi = Collections.max(nilaiMahasiswa);
        int nilaiTerendah = Collections.min(nilaiMahasiswa);
        double rataRata = hitungMean(nilaiMahasiswa);

        // Output hasil analisis
        System.out.println("\nStatistik Nilai Mahasiswa:");
        System.out.printf("Rata-rata nilai : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah  : " + nilaiTerendah);

        sc.close();
    }

    // Fungsi untuk menghitung rata-rata
    public static double hitungMean(ArrayList<Integer> nilaiMahasiswa) {
        int total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        return (double) total / nilaiMahasiswa.size();
    }
}
