package pertemuan2.Prak.PRAK02_2473021_JAVA;

import java.util.Scanner;

/**
 * Pertemuan 02
 * [PRAKTIKUM] Membuat Program Aritmatika
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 24 September 2024
 */

public class A_Aritmatika {
    public static void main(String[] args) {
        // Input
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        double pertama = sc.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        int kedua = sc.nextInt();

        // Process
        double penjumlahan = pertama + kedua;
        double pengurangan = pertama - kedua;
        double perkalian = pertama * kedua;
        double pembagian = pertama / kedua;
        double modulo = pertama % kedua;

        // Output
        System.out.println("==============================");
        System.out.println("------Program Perhitungan-----");
        System.out.println("==============================");
        System.out.println("Hasil Penjumlahan (+) dari :");
        System.out.println(pertama+" + "+kedua+" = "+penjumlahan);
        System.out.println("------------------------------");
        System.out.println("Hasil Pengurangan (-) dari :");
        System.out.println(pertama+" - "+kedua+" = "+pengurangan);
        System.out.println("------------------------------");
        System.out.println("Hasil Perkalian (*) dari :");
        System.out.println(pertama+" * "+kedua+" = "+perkalian);
        System.out.println("------------------------------");
        System.out.println("Hasil Pembagian (/) dari :");
        System.out.println(pertama+" / "+kedua+" = "+pembagian);
        System.out.println("------------------------------");
        System.out.println("Hasil Modulo (%) dari :");
        System.out.println(pertama+" % "+kedua+" = "+modulo);
        System.out.println("==============================");

        sc.close();
    }
}
