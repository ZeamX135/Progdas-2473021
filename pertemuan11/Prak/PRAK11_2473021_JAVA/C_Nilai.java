/**
 * Pertemuan 11
 * [PRAKTIKUM] program untuk menghitung nilai akhir.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 03 Desember 2024
 */
package pertemuan11.Prak.PRAK11_2473021_JAVA;

import java.util.Scanner;

public class C_Nilai {

    public static double nilaiAkhir(int uts, int uas, int kat) {
        return (uts * 0.25) + (uas * 0.25) + (kat * 0.5);
    }

    public static String nilaiMutu(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 73) {
            return "B+";
        } else if (nilaiAkhir >= 67) {
            return "B";
        } else if (nilaiAkhir >= 61) {
            return "C+";
        } else if (nilaiAkhir >= 55) {
            return "C";
        } else if (nilaiAkhir >= 41) {
            return "D";
        } else {
            return "E";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai UTS(25%)\t: ");
        int uts = sc.nextInt();
        System.out.print("Nilai UAS(25%)\t: ");
        int uas = sc.nextInt();
        System.out.print("Nilai KAT(50%)\t: ");
        int kat = sc.nextInt();
        double akhir = nilaiAkhir(uts, uas, kat);
        String mutu = nilaiMutu(akhir);
        System.out.println("Nilai Akhir : " + Math.round(akhir));
        System.out.println("Nilai Mutu : " + mutu);

        sc.close();
    }
}
