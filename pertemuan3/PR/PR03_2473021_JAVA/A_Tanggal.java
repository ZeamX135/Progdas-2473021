/**
 * Pertemuan 03
 * [PR] Membuat program yang dapat mengkonversi tanggal dari format numerik (hari, bulan,tahun) menjadi format teks dengan nama bulan dalam Bahasa Indonesia
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 6 Oktober 2024
 */
package pertemuan3.PR.PR03_2473021_JAVA;

import java.util.Scanner;

public class A_Tanggal {

    public static boolean kabisat(int year) {
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static boolean isValidDate(int day, int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1) {
            return false;
        }

        if (kabisat(year)) {
            daysInMonth[2] = 29;
        }

        return day <= daysInMonth[month];
    }

    public static String getMonthName(int month) {
        String[] months = {
            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        if (month >= 1 && month <= 12) {
            return months[month];
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input:\nTanggal   : ");
        int day = sc.nextInt();

        System.out.print("Bulan     : ");
        int month = sc.nextInt();

        System.out.print("Tahun     : ");
        int year = sc.nextInt();

        year += 2000;

        System.out.println("\nOutput:\nKonversi: " + day + " " + getMonthName(month) + " " + year);

        if (!isValidDate(day, month, year)) {
            System.out.println("Tidak ada tanggal " + day + " di bulan " + getMonthName(month) + " tahun " + year);
        }

        sc.close();
    }
}
