/**
 * Pertemuan 04
 * [PRAKTIKUM] program yang dapat menyarankan destinasi wisata berdasarkan budget yang dimiliki oleh pengguna.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 13 Oktober 2024
 */
package pertemuan4.PR.PR04_2473021_JAVA;

import java.util.Scanner;

public class C_HolidayTrip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================== Holiday Trip Planner ==================");
        System.out.print("Input Budget            : ");
        double budget = sc.nextDouble();
        sc.nextLine();
        System.out.println("\nTengah Tahun= Hotel Stay= 45% of your budget");
        System.out.println("Akhir Tahun= Camp= 25% of your budget");
        System.out.print("Pilihan Waktu Liburan    :");
        String waktuLiburan = sc.nextLine().toLowerCase();

        Integer plan = 0;
        String penginapan = "";
        switch (waktuLiburan) {
            case "tengah tahun":
                plan = 1;
                penginapan = "Hotel/Motel";
                System.out.println("\nDestination Choices:");
                System.out.println("1. Tana Toraja (15% of your budget)");
                System.out.println("2. Taman Laut Bunaken (20% of your budget)");
                System.out.println("3. Kawah Ijen (10% of your budget)\n");
                break;
            case "akhir tahun":
                plan = 2;
                penginapan = "Camping";
                System.out.println("\nDestination Choices:");
                System.out.println("1. Raja Ampat (40% of your budget)");
                System.out.println("2. Diamond Beach (30% of your budget)");
                System.out.println("3. Taman Nasional Gunung Leuser (25% of your budget)\n");
                break;
            default:
                System.out.println("System Error");
        }
        System.out.print("Pilihan Destinasi: ");
        Integer destinasi = sc.nextInt();
        double perjalananPenginapan = 0;
        double lainnya = 0;
        double total = 0;
        double kondisi = 0;
        String status = "";
        switch (plan) {
            case 1:
                switch (destinasi) {
                    case 1:
                        perjalananPenginapan = (budget * 45d / 100) + (budget * 15d / 100);
                        lainnya = 50d / 100 * budget;
                        total = perjalananPenginapan + lainnya;
                        if (budget == total) {
                            status = "";
                        } else if (budget < total) {
                            kondisi = total - budget;
                            status = "Budget Kamu Kurang: " + kondisi;
                        } else if (budget > total) {
                            kondisi = budget - total;
                            status = "Budget Kamu Lebih: " + kondisi;
                        } else {
                            status = "System Error";
                        }
                        break;
                    case 2:
                        perjalananPenginapan = (budget * 45d / 100) + (budget * 20d / 100);
                        lainnya = 50d / 100 * budget;
                        total = perjalananPenginapan + lainnya;
                        if (budget == total) {
                            status = "";
                        } else if (budget < total) {
                            kondisi = total - budget;
                            status = "Budget Kamu Kurang: " + kondisi;
                        } else if (budget > total) {
                            kondisi = budget - total;
                            status = "Budget Kamu Lebih: " + kondisi;
                        } else {
                            status = "System Error";
                        }
                        break;
                    case 3:
                        perjalananPenginapan = (budget * 45d / 100) + (budget * 10d / 100);
                        lainnya = 50d / 100 * budget;
                        total = perjalananPenginapan + lainnya;
                        if (budget == total) {
                            status = "";
                        } else if (budget < total) {
                            kondisi = total - budget;
                            status = "Budget Kamu Kurang: " + kondisi;
                        } else if (budget > total) {
                            kondisi = budget - total;
                            status = "Budget Kamu Lebih: " + kondisi;
                        } else {
                            status = "System Error";
                        }
                        break;
                }
                break;
            case 2:
                switch (destinasi) {
                    case 1:
                        perjalananPenginapan = (budget * 25d / 100) + (budget * 40d / 100);
                        lainnya = 50d / 100 * budget;
                        total = perjalananPenginapan + lainnya;
                        if (budget == total) {
                            status = "";
                        } else if (budget < total) {
                            kondisi = total - budget;
                            status = "Budget Kamu Kurang: " + kondisi;
                        } else if (budget > total) {
                            kondisi = budget - total;
                            status = "Budget Kamu Lebih: " + kondisi;
                        } else {
                            status = "System Error";
                        }
                        break;
                    case 2:
                        perjalananPenginapan = (budget * 25d / 100) + (budget * 30d / 100);
                        lainnya = 50d / 100 * budget;
                        total = perjalananPenginapan + lainnya;
                        if (budget == total) {
                            status = "";
                        } else if (budget < total) {
                            kondisi = total - budget;
                            status = "Budget Kamu Kurang: " + kondisi;
                        } else if (budget > total) {
                            kondisi = budget - total;
                            status = "Budget Kamu Lebih: " + kondisi;
                        } else {
                            status = "System Error";
                        }
                        break;
                    case 3:
                        perjalananPenginapan = (budget * 25d / 100) + (budget * 25d / 100);
                        lainnya = 50d / 100 * budget;
                        total = perjalananPenginapan + lainnya;
                        if (budget == total) {
                            status = "";
                        } else if (budget < total) {
                            kondisi = total - budget;
                            status = "Budget Kamu Kurang: " + kondisi;
                        } else if (budget > total) {
                            kondisi = budget - total;
                            status = "Budget Kamu Lebih: " + kondisi;
                        } else {
                            status = "System Error";
                        }
                        break;
                }
                break;
        }
        System.out.println("\n====================== Plan Summary ======================");
        System.out.println("Waktu Liburan Dilakukan: " + waktuLiburan);
        System.out.println("Penginapan: " + penginapan);
        System.out.println("Estimasi Perjalanan dan Penginapan: " + perjalananPenginapan);
        System.out.println("Estimasi Pengeluaran Lainnya: " + lainnya);
        System.out.println("Estimasi Pengeluaran Total: " + total);
        System.out.println(status);

        sc.close();
    }
}
