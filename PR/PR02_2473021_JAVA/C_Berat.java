/**
 * Pertemuan 02
 * [PR] Membuat Program yang dapat menghitung luas berbagai bangun datar
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 29 September 2024
 */

package PR.PR02_2473021_JAVA;

import java.util.Scanner;

public class C_Berat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(".:=Program Penghitung bangun Datar=:.");
        System.out.println("-------------------------------------");
        
        // Persegi Panjang
        System.out.println("Persegi panjang :");
        System.out.print("Masukkan panjang: ");
        double panjangPersegiPanjang = sc.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebarPersegiPanjang = sc.nextDouble();

        double luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;

        System.out.println("Luas persegi panjang: "+luasPersegiPanjang);
        System.out.println("-------------------------------------");

        // Persegi
        System.out.println("Persegi :");
        System.out.print("Masukkan sisi: ");
        double sisiPersegi = sc.nextDouble();

        double luasPersegi = sisiPersegi*sisiPersegi;

        System.out.println("Luas persegi: "+luasPersegi);
        System.out.println("-------------------------------------");

        // Lingkaran
        System.out.println("Lingkaran :");
        System.out.print("Masukkan jari-jari: ");
        double jariJariLingkaran = sc.nextDouble();

        double luasLingkaran = 3.14*jariJariLingkaran*jariJariLingkaran;

        System.out.println("Luas lingkaran: "+luasLingkaran);
        System.out.println("-------------------------------------");

        // Segitiga
        System.out.println("Segitiga :");
        System.out.print("Masukkan alas: ");
        double alasSegitiga = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggiSegitiga = sc.nextDouble();

        double luasSegitiga = 0.5*alasSegitiga*tinggiSegitiga;
        
        System.out.println("Luas Segitiga: "+luasSegitiga);
        System.out.println("-------------------------------------");
    }
}
