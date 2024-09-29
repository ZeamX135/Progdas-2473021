/**
 * Pertemuan 02
 * [PR] Membuat Program Perhitungan nilai akhir mahasiswa
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 29 September 2024
 */

package PR.PR02_2473021_JAVA;

import java.util.Scanner;

public class B_Nilai {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int uas = sc.nextInt();
        System.out.print("Nilai KAT : ");
        int kat = sc.nextInt();
        System.out.print("Bobot<%> nilai UTS : ");
        double bobotUTS = sc.nextDouble();
        System.out.print("Bobot<%> nilai UAS : ");
        double bobotUAS = sc.nextDouble();
        System.out.print("Bobot<%> nilai KAT : ");
        double bobotKAT = sc.nextDouble();

        // Process
        double hasil = (uts*bobotUTS/100) + (uas*bobotUAS/100) + (kat*bobotKAT/100);

        // Output
        System.out.println();
        System.out.println("=================================");
        System.out.println("Perhitungan nilai mahasiswa :");
        System.out.println("=================================");
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nilai UTS : "+uts);
        System.out.println("Nilai UAS : "+uas);
        System.out.println("Nilai KAT : "+kat);
        System.out.println("Bobot<%> nilai UTS : "+bobotUTS);
        System.out.println("Bobot<%> nilai UAS : "+bobotUAS);
        System.out.println("Bobot<%> nilai KAT : "+bobotKAT);
        System.out.println("==========================================");
        System.out.println("Please wait...calculating...");
        System.out.println("==========================================");
        System.out.println("Nilai akhir "+nama+" : "+hasil);
        System.out.println("pembulatan : "+ Math.round(hasil));

        sc.close();
    }
}
