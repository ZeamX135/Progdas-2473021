/**
 * Pertemuan 03
 * [PR] Membuat Program dimana user diminta untuk menginput 3 nilai bilangan bulat yaitu a,b,c dan mengkategorikan berdasarkan angka terbesar, tengah, dan terkecil
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 6 Oktober 2024
 */
package pertemuan3.PR.PR03_2473021_JAVA;

import java.util.Scanner;

public class B_MaxMin {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input :");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();

        // Process
        int terbesar;
        if (a > b && a > c) {
            terbesar = a;
        } else if (b > a && b > c) {
            terbesar = b;
        } else {
            terbesar = c;
        }

        int terkecil;
        if (a < b && a < c) {
            terkecil = a;
        } else if (b < a && b < c) {
            terkecil = b;
        } else {
            terkecil = c;
        }

        int tengah;
        if (a != terbesar && a != terkecil) {
            tengah = a;
        } else if (b != terbesar && b != terkecil) {
            tengah = b;
        } else {
            tengah = c;
        }

        // Output
        System.out.println("Output :");
        System.out.println("Nilai " + tengah + " di antara " + terbesar + " dan " + terkecil);
        System.out.println("Nilai terbesar adalah " + terbesar);
        System.out.println("Nilai terkecil " + terkecil);

        sc.close();
    }
}
