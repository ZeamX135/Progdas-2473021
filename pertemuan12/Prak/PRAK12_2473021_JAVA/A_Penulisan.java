/**
 * Pertemuan 12
 * [PRAKTIKUM] sistem yang dapat mengkonversi input kalimat menjadi lowercase, uppercase,
 * kebalikannya, kapital di awal, dan tanpa huruf vokal, menghitung jumlah huruf vokal,
 * membalikkan kalimat, dan menghasilkan status palindrom dengan mengabaikan spasi dan tidak case sensitive.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 10 Desember 2024
 */
package pertemuan12.Prak.PRAK12_2473021_JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Penulisan {

    public static void main(String[] args) {
        tampilkanHasil();
    }

    public static void tampilkanHasil() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input\t\t: ");
        String inputKalimat = sc.nextLine();
        System.out.println("--------------------- Konversi ---------------------");
        System.out.println("Lowercase\t\t: " + konversiLowercase(inputKalimat));
        System.out.println("Uppercase\t\t: " + konversiUppercase(inputKalimat));
        System.out.println("Kebalikan Huruf\t\t: " + kebalikanHuruf(inputKalimat));
        System.out.println("Kapital di Awal\t\t: " + kapitalDiAwal(inputKalimat));
        System.out.println("Tanpa Huruf Vokal\t: " + tanpaHurufVokal(inputKalimat));
        System.out.println("----------------------- Other -----------------------");
        System.out.println("Jumlah Huruf Vokal\t: " + jumlahHurufVokal(inputKalimat));
        System.out.println("Kalimat Terbalik\t: " + kalimatTerbalik(inputKalimat));
        if (cekPalindrome(inputKalimat)) {
            System.out.println("Palindrome\t\t: Ya");
        } else {
            System.out.println("Palindrome\t\t: Tidak");
        }
        sc.close();
    }

    public static String konversiLowercase(String kalimat) {
        return kalimat.toLowerCase();
    }

    public static String konversiUppercase(String kalimat) {
        return kalimat.toUpperCase();
    }

    public static String kebalikanHuruf(String kalimat) {
        StringBuilder hasilKebalikan = new StringBuilder(kalimat.length());
        for (char huruf : kalimat.toCharArray()) {
            if (Character.isUpperCase(huruf)) {
                hasilKebalikan.append(Character.toLowerCase(huruf));
            } else {
                hasilKebalikan.append(Character.toUpperCase(huruf));
            }
        }
        return hasilKebalikan.toString();
    }

    public static String kapitalDiAwal(String kalimat) {
        ArrayList<Character> hurufList = new ArrayList<>();
        boolean awalKata = true;

        for (char huruf : kalimat.toCharArray()) {
            if (awalKata) {
                hurufList.add(Character.toUpperCase(huruf));
                awalKata = false;
            } else {
                hurufList.add(Character.toLowerCase(huruf));
            }
            if (Character.isWhitespace(huruf)) {
                awalKata = true;
            }
        }

        StringBuilder hasilKapital = new StringBuilder();
        for (char huruf : hurufList) {
            hasilKapital.append(huruf);
        }

        return hasilKapital.toString();
    }

    public static String tanpaHurufVokal(String kalimat) {
        return kalimat.replaceAll("[AIUEOaiueo]", "");
    }

    public static int jumlahHurufVokal(String kalimat) {
        int jumlahVokal = 0;
        String hurufVokal = "AIUEOaiueo";
        for (char huruf : kalimat.toCharArray()) {
            if (hurufVokal.indexOf(huruf) != -1) {
                jumlahVokal++;
            }
        }
        return jumlahVokal;
    }

    public static String kalimatTerbalik(String kalimat) {
        StringBuilder hasilTerbalik = new StringBuilder(kalimat);
        return hasilTerbalik.reverse().toString();
    }

    public static boolean cekPalindrome(String kalimat) {
        String kalimatBersih = kalimat.replaceAll("\\s+", "").toLowerCase();
        String terbalik = new StringBuilder(kalimatBersih).reverse().toString();
        return kalimatBersih.equals(terbalik);
    }
}
