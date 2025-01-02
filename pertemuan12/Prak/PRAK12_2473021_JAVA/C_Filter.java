/**
 * Pertemuan 12
 * [PRAKTIKUM] sistem yang dapat menerima inputan nomor telepon dari pengguna. Sistem harus dapat
 * mencari nomor telepon berdasarkan potongan nomor yang dimasukkan.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 10 Desember 2024
 */
package pertemuan12.Prak.PRAK12_2473021_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_Filter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arrNomor = new ArrayList<>();

        System.out.print("Banyaknya Nomor: ");
        int limit = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < limit; i++) {
            System.out.print("Nomor " + (i + 1) + ": ");
            String nomor = sc.nextLine();
            arrNomor.add(nomor);
        }

        System.out.print("Potongan nomor yang dicari: ");
        String cari = sc.nextLine();

        List<String> hasil = new ArrayList<>();
        for (String nomor : arrNomor) {
            if (nomor.contains(cari)) {
                hasil.add(nomor);
            }
        }

        if (!hasil.isEmpty()) {
            System.out.println("\nHasil:");
            for (String nomor : hasil) {
                System.out.println(nomor);
            }
        } else {
            System.out.println("Tidak ada nomor yang sesuai");
        }

        sc.close();
    }
}
