
/**
 * Pertemuan 10
 * [PR] program yang menggunakan ArrayList untuk melakukan berbagai operasi pada daftar bilangan bulat.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 02 Desember 2024
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_OperasiArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elemen = new ArrayList<>();
        int operasi;
        System.out.print("Masukkan jumlah elemen (N): ");
        int jumlah = sc.nextInt();

        System.out.println("Masukkan elemen: ");
        for (int i = 0; i < jumlah; i++) {
            elemen.add(sc.nextInt());
        }
        do {
            System.out.println("\nArraylist saat ini: " + elemen);
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambahkan elemen baru");
            System.out.println("2. Hapus elemen tertentu");
            System.out.println("3. Ganti elemen pada indeks tertentu");
            System.out.println("4. Cari elemen tertentu");
            System.out.println("5. Urutkan elemen");
            System.out.println("6. Tampilkan elemen dalam urutan terbalik");
            System.out.println("7. Hitung jumlah elemen");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan (1-8): ");
            operasi = sc.nextInt();

            switch (operasi) {
                case 1:
                    System.out.print("Masukkan elemen baru: ");
                    elemen.add(sc.nextInt());
                    System.out.println("Elemen berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan elemen yang ingin dihapus: ");
                    int delete = sc.nextInt();
                    if (elemen.remove((Integer) delete)) {
                        System.out.println("Elemen berhasil dihapus.");
                    } else {
                        System.out.println("Elemen tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan indeks yang ingin diganti: ");
                    int indeks = sc.nextInt();
                    if (indeks >= 0 && indeks <= elemen.size()) {
                        System.out.print("Masukkan elemen baru: ");
                        int baru = sc.nextInt();
                        elemen.set(indeks, baru);
                        System.out.println("Elemen pada indeks " + indeks + " berhasil diganti.");
                    } else {
                        System.out.println("Indeks tidak ditemukan");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan elemen yang ingin dicari: ");
                    int find = sc.nextInt();
                    int x = 0;
                    for (int i = 0; i < elemen.size(); i++) {
                        if (elemen.get(i) == find) {
                            System.out.println("Elemen " + find + " ditemukan pada indeks ke-" + i);
                            x = 1;
                        }
                    }
                    if (x != 1) {
                        System.out.println("Elemen tidak ditemukan.");
                    }
                    break;
                case 5:
                    Collections.sort(elemen);
                    System.out.println("Arraylist berhasil diurutkan.");
                    break;
                case 6:
                    Collections.reverse(elemen);
                    System.out.println("Elemen dalam urutan terbalik: " + elemen);
                    break;
                case 7:
                    System.out.println("Jumlah elemen dalam arraylist: " + elemen.size());
                    break;
                case 8:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Input tidak valid, pilih angka (1-8)");
            }
        } while (operasi != 8);

        sc.close();
    }
}
