/**
 * Pertemuan 03
 * [PRAKTIKUM] Membuat Penghitungan diskon berdasarkan kategori barang
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 01 Oktober 2024
 */

package pertemuan3.Prak.PRAK03_2473021_JAVA;

import java.util.Scanner;

public class B_Diskon {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("     Program Diskon Barang    ");
        System.out.println("==============================");
        System.out.print("Masukkan harga barang (Rp) : ");
        double harga = sc.nextDouble();
        System.out.print("Masukkan kategori barang (elektronik, pakaian, makanan) : ");
        String kategori = sc.next();

        // Process
        String diskon;
        if("elektronik".equals(kategori)){
            diskon = "Anda mendapatkan diskon 10% untuk barang ";
        }else if ("pakaian".equals(kategori)) {
            diskon = "Anda mendapatkan diskon 20% untuk barang ";
        }else if ("makanan".equals(kategori)) {
            diskon = "Anda mendapatkan diskon 5% untuk barang ";
        }else{
            diskon = "Anda tidak mendapat diskon untuk barang "+kategori;
        }

        double hasil;
        if("elektronik".equals(kategori)){
            hasil = harga-(harga*10.0/100);
        }else if("pakaian".equals(kategori)){
            hasil = harga-(harga*20.0/100);
        }else if("makanan".equals(kategori)){
            hasil = harga-(harga*5.0/100);
        }else{
            hasil = harga;
        }

        // Output
        System.out.println(diskon+kategori+".");
        System.out.println("==============================");
        System.out.println("Harga asli barang   : Rp "+harga);
        System.out.println("Harga setelah diskon: Rp "+hasil);
        System.out.println("==============================");
        System.out.println("Terima kasih telah berbelanja!");

        sc.close();
    }
}
