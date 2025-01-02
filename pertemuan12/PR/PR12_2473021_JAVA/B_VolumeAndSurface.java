/**
 * Pertemuan 12
 * [PR] Program yang memungkinkan pengguna untuk memilih 3 jenis bangun ruang.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 15 Desember 2024
 */
package pertemuan12.PR.PR12_2473021_JAVA;

import java.util.Scanner;

public class B_VolumeAndSurface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihan:");
        System.out.println("1. Kubus");
        System.out.println("2. Prisma Segitiga");
        System.out.println("3. Bola");

        int pilih;
        while (true) {
            System.out.print("\nPilih: ");
            if (sc.hasNextInt()) {
                pilih = sc.nextInt();
                if (pilih >= 1 && pilih <= 3) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid, masukkan angka 1-3.");
                }
            } else {
                System.out.println("Input tidak valid, masukkan angka.");
                sc.next();
            }
        }

        switch (pilih) {
            case 1: {
                System.out.print("Masukkan luas area: ");
                double luas = sc.nextDouble();
                double sisi = Math.sqrt(luas / 6);
                double volume = Math.pow(sisi, 3);
                System.out.printf("\nVolume: %.2f\n", volume);
                System.out.printf("Sisi: %.2f\n", sisi);
                break;
            }
            case 2: {
                System.out.print("Masukkan luas area: ");
                double luas = sc.nextDouble();
                System.out.print("Masukkan panjang sisi segitiga: ");
                double sisi = sc.nextDouble();
                double luasAlas = 0.5 * Math.pow(sisi, 2);
                double kelilingAlas = 3 * sisi;
                double tinggi = (luas - 2 * luasAlas) / kelilingAlas;
                double volume = luasAlas * tinggi;
                System.out.printf("\nVolume: %.2f\n", volume);
                System.out.printf("Tinggi Prisma: %.2f\n", tinggi);
                break;
            }
            case 3: {
                System.out.print("Masukkan luas area: ");
                double luas = sc.nextDouble();
                double jariJari = Math.sqrt(luas / (4 * Math.PI));
                double volume = (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
                System.out.printf("\nVolume: %.2f\n", volume);
                System.out.printf("Jari-jari: %.2f\n", jariJari);
                break;
            }
            default:
                break;
        }

        sc.close();
    }
}
