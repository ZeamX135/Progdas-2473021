package belajarUTS;

import java.util.Scanner;

public class cleanDuck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CleanDUCK Indonesia!");

        System.out.println("\nSilahkan Masukkan Data Pelanggan:");
        System.out.print("Nama : ");
        String nama = sc.nextLine();

        String noTelp;
        while (true) {
            System.out.print("No Telp: ");
            noTelp = sc.nextLine();
            if (noTelp.matches("\\d+")) {
                break;
            } else {
                System.out.println("Nomor telepon harus berupa angka. Silahkan coba lagi.");
            }
        }


        System.out.print("Tim Bola Kesayangan: ");
        String timBola = sc.nextLine();

        System.out.println("\nHalo " + nama + ", silahkan pilih layanan jasa\nyang Anda inginkan :");
        System.out.println("1. Premium Washing Rp 100.000");
        System.out.println("2. Washing and Wax Rp 120.000");
        System.out.println("3. Full Package Rp 550.000");
        System.out.print("Pilihan anda: ");
        int pilihan = sc.nextInt();

        String layanan="";
        switch (pilihan) {
            case 1:
                layanan = "1. Premium Washing, Rp 100.000,00";
                break;
            case 2:
                layanan = "2. Washing and Wax, Rp 120.000,00";
                break;
            case 3:
                layanan = "3. Full Package, Rp 550.000,00";
                break;
        }

        System.out.println("\nPelanggan:" + nama);
        System.out.println("Nomor Telepon:" + noTelp);
        System.out.println("Kode:" + timBola);
        System.out.println("Layanan: " + layanan);
    }
}
