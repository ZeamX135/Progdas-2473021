/**
 * Pertemuan 04
 * [PRAKTIKUM] program yang akan menghasilkan tiket parkir.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 12 Oktober 2024
 */
package pertemuan4.PR.PR04_2473021_JAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class B_TiketParkir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============== Aplikasi Tiket Parkir ==============");
        System.out.println("1. Pekerja");
        System.out.println("2. Pengunjung");
        System.out.println("===================================================");
        System.out.print("Pilihan Pekerja/Pengunjung : ");
        int masuk = sc.nextInt();

        System.out.println("\n===================================================");
        System.out.println("==================== Kendaraan ====================");
        int harga = 0;
        String jenisKendaraan = "";
        int durasi = 0;
        switch (masuk) {
            case 1:
                System.out.println("1. Truk");
                System.out.println("         Rp8.000,-/Flat");
                System.out.println("2. Mobil");
                System.out.println("         Rp5.000,-/Flat");
                System.out.println("3. Motor");
                System.out.println("         Rp3.000,-/Flat");
                System.out.println("===================================================");
                System.out.print("Jenis Kendaraan : ");
                int jenisKendaraan1 = sc.nextInt();
                switch (jenisKendaraan1) {
                    case 1:
                        harga = 8000;
                        jenisKendaraan = "TRUK";
                        break;
                    case 2:
                        harga = 5000;
                        jenisKendaraan = "MOBIL";
                        break;
                    case 3:
                        harga = 3000;
                        jenisKendaraan = "MOTOR";
                        break;
                }
                break;
            case 2:
                System.out.println("1. Bus");
                System.out.println("        Rp20.000,-/Jam pertama");
                System.out.println("        Rp8.000,-/ Jam berikutnya (< 6 jam)");
                System.out.println("        Rp5.000,-/ Jam berikutnya (> 6 jam)");
                System.out.println("2. Mobil");
                System.out.println("        Rp12.000,-/Jam pertama");
                System.out.println("        Rp5.000,-/ Jam berikutnya (< 6 jam)");
                System.out.println("        Rp3.000,-/ Jam berikutnya (> 6 jam)");
                System.out.println("3. Motor");
                System.out.println("        Rp8.000,-/Jam pertama");
                System.out.println("        Rp4.000,-/ Jam berikutnya (< 6 jam)");
                System.out.println("        Rp2.000,-/ Jam berikutnya (> 6 jam)");
                System.out.println("===================================================");
                System.out.print("Jenis Kendaraan : ");
                int jenisKendaraan2 = sc.nextInt();
                System.out.print("Lama Parkir : ");
                durasi = sc.nextInt();

                switch (jenisKendaraan2) {
                    case 1:
                        if (durasi == 1) {
                            harga = 20000;
                        } else if (durasi > 1 && durasi <= 6) {
                            harga = 20000 + (8000 * (durasi - 1));
                        } else if (durasi > 6) {
                            harga = 20000 + (5000 * (durasi - 1));
                        } else {
                            harga = 0;
                            System.out.println("System Error");
                        }
                        jenisKendaraan = "BUS";
                        break;
                    case 2:
                        if (durasi == 1) {
                            harga = 12000;
                        } else if (durasi > 1 && durasi <= 6) {
                            harga = 12000 + (5000 * (durasi - 1));
                        } else if (durasi > 6) {
                            harga = 12000 + (3000 * (durasi - 1));
                        } else {
                            harga = 0;
                            System.out.println("System Error");
                        }
                        jenisKendaraan = "MOBIL";
                        break;
                    case 3:
                        if (durasi == 1) {
                            harga = 8000;
                        } else if (durasi > 1 && durasi <= 6) {
                            harga = 8000 + (4000 * (durasi - 1));
                        } else if (durasi > 6) {
                            harga = 8000 + (2000 * (durasi - 6));
                        } else {
                            harga = 0;
                            System.out.println("System Error");
                        }
                        jenisKendaraan = "MOTOR";
                        break;
                    default:
                        System.out.println("System Error");
                }

        }
        LocalDateTime objectTanggalSaya = LocalDateTime.now();
        DateTimeFormatter formatObjectSaya = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm:ss");
        String tanggalDiformat = objectTanggalSaya.format(formatObjectSaya);

        System.out.println("\n==================== Tiket Parkir ====================");
        System.out.println("                SUMMARECON MAL BEKASI 1               ");
        System.out.println("Jenis Kendaraan : " + jenisKendaraan);
        System.out.println("Keluar          : " + tanggalDiformat);
        switch (masuk) {
            case 1:
                break;
            case 2:
                System.out.println("Lama            : " + durasi + "jam");
                break;
            default:
                System.out.println("System Error");
        }
        System.out.println("\nRp: " + harga);
        sc.close();
    }
}
