/**
 * Pertemuan 10
 * [PRAKTIKUM]  program yang meminta sc N data untuk Nama dan IPK mahasiswa untuk disimpan ke dalam suatu list.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 26 November 2024
 */
package pertemuan10.Prak.PRAK10_2473021_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class C_NilaiPredikat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Double> arr2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            arr1.add(nama);
            arr2.add(ipk);
        }

        System.out.println("-------------------------------");

        double ipkTertinggi = arr2.get(0);
        int indeksTertinggi = 0;
        for (int i = 1; i < arr2.size(); i++) {
            if (arr2.get(i) > ipkTertinggi) {
                ipkTertinggi = arr2.get(i);
                indeksTertinggi = i;
            }
        }
        String namaTertinggi = arr1.get(indeksTertinggi);

        ArrayList<String> denganPujian = new ArrayList<>();
        ArrayList<String> sangatMemuaskan = new ArrayList<>();
        ArrayList<String> memuaskan = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double ipk = arr2.get(i);
            String nama = arr1.get(i);
            if (ipk > 3.5) {
                denganPujian.add(nama);
            } else if (ipk > 3.0) {
                sangatMemuaskan.add(nama);
            } else if (ipk > 2.75) {
                memuaskan.add(nama);
            }
        }

        System.out.println("IPK tertinggi: " + namaTertinggi + ": " + ipkTertinggi);
        System.out.print("Predikat dengan Pujian: ");

        for (int i = 0; i < denganPujian.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(denganPujian.get(i));
        }

        System.out.println();

        System.out.print("Predikat Sangat Memuaskan: ");

        for (int i = 0; i < sangatMemuaskan.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(sangatMemuaskan.get(i));
        }

        System.out.println();

        System.out.print("Predikat Memuaskan: ");

        for (int i = 0; i < memuaskan.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(memuaskan.get(i));
        }

        System.out.println();

        sc.close();
    }
}
