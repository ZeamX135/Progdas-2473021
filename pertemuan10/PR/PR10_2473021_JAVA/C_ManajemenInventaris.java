
/**
 * Pertemuan 10
 * [PR]  program manajemen Inventaris
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 02 Desember 2024
 */
import java.util.ArrayList;
import java.util.Scanner;

public class C_ManajemenInventaris {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah barang inventaris: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        ArrayList<String> arrNama = new ArrayList<>();
        ArrayList<Integer> arrJumlah = new ArrayList<>();
        ArrayList<Integer> arrHarga = new ArrayList<>();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Barang " + (i + 1) + ": ");
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Jumlah: ");
            int jumlahBarang = sc.nextInt();
            System.out.print("Harga: ");
            int harga = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------------");
            arrNama.add(nama);
            arrJumlah.add(jumlahBarang);
            arrHarga.add(harga);
        }

        double totalInventaris = 0;
        for (int i = 0; i < jumlah; i++) {
            totalInventaris += arrJumlah.get(i) * arrHarga.get(i);
        }
        System.out.printf("Total nilai inventaris: %.1f%n", totalInventaris);
        System.out.println("---------------------------------");

        System.out.println("Barang dengan jumlah kurang dari 10:");
        for (int i = 0; i < jumlah; i++) {
            if (arrJumlah.get(i) < 10) {
                System.out.println(arrNama.get(i) + " - " + arrJumlah.get(i));
            }
        }
        System.out.println("---------------------------------");

        double rataRata = 0;
        for (int harga : arrHarga) {
            rataRata += harga;
        }
        rataRata /= jumlah;
        System.out.printf("Rata-rata harga barang: %.1f%n", rataRata);

        System.out.println("Barang dengan harga di atas rata-rata:");
        for (int i = 0; i < jumlah; i++) {
            if (arrHarga.get(i) > rataRata) {
                System.out.println(arrNama.get(i) + " - " + arrHarga.get(i));
            }
        }
        System.out.println("---------------------------------");

        sc.close();
    }
}
