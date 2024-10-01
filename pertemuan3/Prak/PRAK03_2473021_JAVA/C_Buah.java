/**
 * Pertemuan 03
 * [PRAKTIKUM] Membuat Penghitungan Harga buah
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 01 Oktober 2024
 */

package pertemuan3.Prak.PRAK03_2473021_JAVA;

import java.util.Scanner;

public class C_Buah {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.println("Buah ke-1");
        System.out.print("Buah (Nanas/Anggur/Manggis) : ");
        String buah1 = sc.next();
        System.out.print("Jumlah "+buah1+" (kg)           : ");
        int jumlah1 = sc.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("Buah ke-2");
        System.out.print("Buah (Nanas/Anggur/Manggis) : ");
        String buah2 = sc.next();
        System.out.print("Jumlah "+buah2+" (kg)         : ");
        int jumlah2 = sc.nextInt();
        
        // Process
        int jumlahnanas = 0;
        int perkilo1nanas = 0;
        int perkilo2nanas = 0;
        if("Nanas".equals(buah1)){
            jumlahnanas = jumlah1;
            perkilo1nanas = jumlah1*50000;
        }else if("Nanas".equals(buah2)){
            jumlahnanas = jumlah2;
            perkilo2nanas = jumlah2*50000;
        }else{
            jumlahnanas = 0;
            perkilo1nanas = 0;
            perkilo2nanas = 0;
        }

        int jumlahanggur;
        int perkilo1anggur = 0;
        int perkilo2anggur = 0;
        if("Anggur".equals(buah1)){
            jumlahanggur = jumlah1;
            perkilo1anggur = jumlah1*15000;
        }else if("Anggur".equals(buah2)){
            jumlahanggur = jumlah2;
            perkilo2anggur = jumlah2*15000;
        }else{
            jumlahanggur = 0;
            perkilo1anggur = 0;
            perkilo2anggur = 0;
        }

        int jumlahmanggis = 0;
        int perkilo1manggis = 0;
        int perkilo2manggis = 0;
        if("Manggis".equals(buah1)){
            jumlahmanggis = jumlah1;
            perkilo1manggis = jumlah1*25000;

        }else if("Manggis".equals(buah2)){
            jumlahmanggis = jumlah2;
            perkilo2manggis = jumlah2*25000;
        }else{
            jumlahmanggis = 0;
            perkilo1manggis = 0;
            perkilo2manggis = 0;
        }

        int totaljumlah = jumlah1+jumlah2;
 
        int totalharga = perkilo1nanas+perkilo2nanas+perkilo1anggur+perkilo2anggur+perkilo1manggis+perkilo2manggis;

        // Output
        System.out.println("==============================================");
        System.out.println("Jumlah Buah Nanas        : " +jumlahnanas);
        System.out.println("Jumlah Buah Anggur       : " +jumlahanggur);
        System.out.println("Jumlah Buah Manggis      : " +jumlahmanggis);
        System.out.println("==============================================");
        System.out.println("Total Jumlah Buah adalah "+totaljumlah+" kg");
        System.out.println("Total Harga Buah Rp "+totalharga);

        sc.close();
    }
}
