/**
 * Pertemuan 12
 * [PRAKTIKUM] sistem yang menerima input panjang sisi a, panjang sisi b, dan sudut b dari sebuah segitiga.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 10 Desember 2024
 */
package pertemuan12.Prak.PRAK12_2473021_JAVA;

import java.util.Scanner;

public class B_Segitiga {

    public static double hitungA(double a, double b, double sudutB) {
        double sudutBRadian = Math.toRadians(sudutB);
        double sudutARadian = Math.asin(Math.sin(sudutBRadian) * a / b);
        return Math.toDegrees(sudutARadian);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sudut dan panjang sisi segitiga");

        System.out.print("Masukkan panjang sisi a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan panjang sisi b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan sudut b: ");
        double sudutB = input.nextDouble();

        double sudutA = hitungA(a, b, sudutB);

        System.out.println("\nDalam segitiga ABC, jika");
        System.out.println("(a = " + a + "),");
        System.out.println("(b = " + b + "),");
        System.out.println("dan (C = " + sudutB + "^\\circ),");
        System.out.println("cari sudut (A) menggunakan hukum sin!");
        System.out.printf("\nSudut (A): %.2f%n", sudutA);

        input.close();
    }
}
