/**
 * Pertemuan 03
 * [PRAKTIKUM] Membuat Program Predikat nilai
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 01 Oktober 2024
 */

package pertemuan3.Prak.PRAK03_2473021_JAVA;

import java.util.Scanner;

public class A_Predikat {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan nama     : ");
        String nama = sc.next();
        System.out.print("Masukkan nilai    : ");
        int nilai = sc.nextInt();
        
        // Process
        String predikat;
        if(80 <= nilai && nilai <=100){
            predikat = "Sangat Baik";
        } else if(70 <= nilai && nilai <=79){
            predikat = "Baik";
        } else if(60 <= nilai && nilai <=69){
            predikat = "Cukup";
        } else if(0 <= nilai && nilai < 60){
            predikat = "Kurang";
        } else {
            predikat = "Nilai tidak valid";
        }

        // Output
        System.out.println("Nama              : "+nama);
        System.out.println("Predikat          : "+predikat);
        sc.close();
    }
}
