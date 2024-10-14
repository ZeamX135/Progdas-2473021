/**
 * Pertemuan 04
 * [PRAKTIKUM] program untuk mengecek level kesulitan sebuah test.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 08 Oktober 2024
 */
package pertemuan4.Prak.PRAK04_2473021_JAVA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class B_LevelTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Peserta di Test 1             : ");
        double peserta1 = sc.nextInt();
        System.out.print("Peserta yang lulus di Test 1  : ");
        double lulus1 = sc.nextInt();
        System.out.print("Peserta di Test 2             : ");
        double peserta2 = sc.nextInt();
        System.out.print("Peserta yang lulus di Test 2  : ");
        double lulus2 = sc.nextInt();
        System.out.print("Peserta di Test 3             : ");
        double peserta3 = sc.nextInt();
        System.out.print("Peserta yang lulus di Test 3  : ");
        double lulus3 = sc.nextInt();
        System.out.print("Peserta di Test 4             : ");
        double peserta4 = sc.nextInt();
        System.out.print("Peserta yang lulus di Test 4  : ");
        double lulus4 = sc.nextInt();
        System.out.print("Peserta di Test 5             : ");
        double peserta5 = sc.nextInt();
        System.out.print("Peserta yang lulus di Test 5  : ");
        double lulus5 = sc.nextInt();

        double persenLulus1 = lulus1 / peserta1 * 100;
        double persenLulus2 = lulus2 / peserta2 * 100;
        double persenLulus3 = lulus3 / peserta3 * 100;
        double persenLulus4 = lulus4 / peserta4 * 100;
        double persenLulus5 = lulus5 / peserta5 * 100;

        int mudah = 0;
        int sedang = 0;
        int sulit = 0;

        String level1 = "";
        if (persenLulus1 >= 70) {
            level1 = "Mudah";
            mudah += 1;
        } else if (persenLulus1 >= 40 && persenLulus2 < 70) {
            level1 = "Sedang";
            sedang += 1;
        } else if (persenLulus1 < 40) {
            level1 = "Sulit";
            sulit += 1;
        }
        String level2 = "";
        if (persenLulus2 >= 70) {
            level2 = "Mudah";
            mudah += 1;
        } else if (persenLulus2 >= 40 && persenLulus2 < 70) {
            level2 = "Sedang";
            sedang += 1;
        } else if (persenLulus2 < 40) {
            level2 = "Sulit";
            sulit += 1;
        }
        String level3 = "";
        if (persenLulus3 >= 70) {
            level3 = "Mudah";
            mudah += 1;
        } else if (persenLulus3 >= 40 && persenLulus3 < 70) {
            level3 = "Sedang";
            sedang += 1;
        } else if (persenLulus3 < 40) {
            level3 = "Sulit";
            sulit += 1;
        }
        String level4 = "";
        if (persenLulus4 >= 70) {
            level4 = "Mudah";
            mudah += 1;
        } else if (persenLulus4 >= 40 && persenLulus4 < 70) {
            level4 = "Sedang";
            sedang += 1;
        } else if (persenLulus4 < 40) {
            level4 = "Sulit";
            sulit += 1;
        }
        String level5 = "";
        if (persenLulus5 >= 70) {
            level5 = "Mudah";
            mudah += 1;
        } else if (persenLulus5 >= 40 && persenLulus5 < 70) {
            level5 = "Sedang";
            sedang += 1;
        } else if (persenLulus5 < 40) {
            level5 = "Sulit";
            sulit += 1;
        }

        System.out.println("========== Rincian Test ==========");
        System.out.println("Nama Test       || Persentase Kelulusan || Level");
        System.out.println("Test 1          || " + df.format(persenLulus1) + "                   || " + level1);
        System.out.println("Test 2          || " + df.format(persenLulus2) + "                   || " + level2);
        System.out.println("Test 3          || " + df.format(persenLulus3) + "                   || " + level3);
        System.out.println("Test 4          || " + df.format(persenLulus4) + "                   || " + level4);
        System.out.println("Test 5          || " + df.format(persenLulus5) + "                   || " + level5);

        System.out.println("=========== Hasil Test ===========");
        System.out.println("Jumlah Level Mudah = " + mudah);
        System.out.println("Jumlah Level Sedang = " + sedang);
        System.out.println("Jumlah Level Sulit = " + sulit);

        if (sedang >= 2 && sulit >= 1 || sulit >= 2) {
            System.out.println("\nTarget Tercapai");
        } else {
            System.out.println("\nTarget Gagal Tercapai");
        }

        sc.close();
    }
}
