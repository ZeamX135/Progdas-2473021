/**
 * Pertemuan 04
 * [PRAKTIKUM] program pembelian tiket museum yang menampilkan daftar museum per provinsinya
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 08 Oktober 2024
 */
package pertemuan4.Prak.PRAK04_2473021_JAVA;

import java.util.Scanner;

public class C_Museum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Pengguna: ");
        String nama = input.next();
        System.out.println("======== APP MUSEUM =========");
        System.out.println("1. Jakarta");
        System.out.println("2. Jawa Barat");
        System.out.println("3. Jawa Timur");
        System.out.println("=============================");
        System.out.print("Pilihan Provinsi : ");
        int province = input.nextInt();
        System.out.println("======= Daftar Museum =======");
        int museum1 = 0;
        int museum2 = 0;
        int museum3 = 0;
        if (province == 1) {
            System.out.println("1. Museum Bank Indonesia");
            System.out.println("2. Museum Fatahillah");
            System.out.println("3. Museum Macan");
            System.out.println("=============================");
            System.out.print("Pilihan Museum: ");
            museum1 = input.nextInt();
            System.out.println("\n");
            switch (museum1) {
                case 1:
                    System.out.println("Museum Bank Indonesia");
                    break;
                case 2:
                    System.out.println("Museum Fatahillah");
                    break;
                case 3:
                    System.out.println("Museum Macan");
                    break;
                default:
                    System.out.println("System Error");
                    break;
            }
        } else if (province == 2) {
            System.out.println("1. Museum Geologi");
            System.out.println("2. Taman Patung NuArt");
            System.out.println("3. The Bucketlist Indonesia");
            System.out.println("=============================");
            System.out.print("Pilihan Museum: ");
            museum2 = input.nextInt();
            System.out.println("\n");
            switch (museum2) {
                case 1:
                    System.out.println("Museum Geologi");
                    break;
                case 2:
                    System.out.println("Taman Patung NuArt");
                    break;
                case 3:
                    System.out.println("The Bucketlist Indonesia");
                    break;
                default:
                    System.out.println("System Error");
                    break;
            }
        } else if (province == 3) {
            System.out.println("1. House of Sampoerna");
            System.out.println("2. Museum Angkut");
            System.out.println("3. Museum dan Perpustakaan Bung Karno");
            System.out.println("=============================");
            System.out.print("Pilihan Museum: ");
            museum3 = input.nextInt();
            System.out.println("\n");
            switch (museum3) {
                case 1:
                    System.out.println("House of Sampoerna");
                    break;
                case 2:
                    System.out.println("Museum Angkut");
                    break;
                case 3:
                    System.out.println("Museum dan Perpustakaan Bung Karno");
                    break;
                default:
                    System.out.println("System Error");
                    break;

            }
        }
        System.out.println("======= Rincian Harga =======");
        int hargatiket = 0;
        if (museum1 > 0) {
            switch (museum1) {
                case 1:
                    System.out.println("Pelajar\t\t= Gratis");
                    System.out.println("Umum\t\t= 5000");
                    System.out.println("=============================");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket1 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket1 = input.nextInt();
                    if (jenistiket1.equals("pelajar") || jenistiket1.equals("Pelajar")) {
                        hargatiket = 0 * jumlahtiket1;
                    } else if (jenistiket1.equals("Umum") || jenistiket1.equals("umum")) {
                        hargatiket = 5000 * jumlahtiket1;
                    }
                    break;
                case 2:
                    System.out.println("Pelajar\t\t= 5000");
                    System.out.println("Umum\t\t= 10000");
                    System.out.println("=============================");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket2 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket2 = input.nextInt();
                    if (jenistiket2.equals("pelajar") || jenistiket2.equals("Pelajar")) {
                        hargatiket = 5000 * jumlahtiket2;
                    } else if (jenistiket2.equals("Umum") || jenistiket2.equals("umum")) {
                        hargatiket = 10000 * jumlahtiket2;
                    }
                    break;
                case 3:
                    System.out.println("Pelajar\t\t= 60000");
                    System.out.println("Umum\t\t= 70000");
                    System.out.println("=============================");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket3 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket3 = input.nextInt();
                    if (jenistiket3.equals("pelajar") || jenistiket3.equals("Pelajar")) {
                        hargatiket = 60000 * jumlahtiket3;
                    } else if (jenistiket3.equals("Umum") || jenistiket3.equals("umum")) {
                        hargatiket = 70000 * jumlahtiket3;
                    }
                    break;
                default:
                    System.out.println("System Error");
                    break;

            }
        } else if (museum2 > 0) {
            switch (museum2) {
                case 1:
                    System.out.println("Pelajar\t\t= 2000");
                    System.out.println("Umum\t\t= 3000");
                    System.out.println("=============================");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket4 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket4 = input.nextInt();
                    if (jenistiket4.equals("pelajar") || jenistiket4.equals("Pelajar")) {
                        hargatiket = 2000 * jumlahtiket4;
                    } else if (jenistiket4.equals("Umum") || jenistiket4.equals("umum")) {
                        hargatiket = 3000 * jumlahtiket4;
                    }
                    break;
                case 2:
                    System.out.println("Pelajar\t\t= 50000");
                    System.out.println("Umum\t\t= 25000");
                    System.out.println("=============================");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket5 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket5 = input.nextInt();
                    if (jenistiket5.equals("pelajar") || jenistiket5.equals("Pelajar")) {
                        hargatiket = 50000 * jumlahtiket5;
                    } else if (jenistiket5.equals("Umum") || jenistiket5.equals("umum")) {
                        hargatiket = 25000 * jumlahtiket5;
                    }
                    break;
                case 3:
                    System.out.println("Umum\t\t= 30000");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket9 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket9 = input.nextInt();
                    if (jenistiket9.equals("Umum") || jenistiket9.equals("umum")) {
                        hargatiket = 30000 * jumlahtiket9;
                    }
                    break;
                default:
                    System.out.println("System Error");
                    break;

            }
        } else if (museum3 > 0) {
            switch (museum3) {
                case 1:
                    System.out.println("Umum\t\t= Gratis");
                    System.out.println("=============================");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket6 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket6 = input.nextInt();
                    if (jenistiket6.equals("Umum") || jenistiket6.equals("umum")) {
                        hargatiket = 0 * jumlahtiket6;
                    }
                    break;
                case 2:
                    System.out.println("Dewasa\t\t= 100000");
                    System.out.println("Anak\t\t= Gratis");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket7 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket7 = input.nextInt();
                    if (jenistiket7.equals("dewasa") || jenistiket7.equals("Dewasa")) {
                        hargatiket = 100000 * jumlahtiket7;
                    } else if (jenistiket7.equals("Anak") || jenistiket7.equals("anak")) {
                        hargatiket = 0 * jumlahtiket7;
                    }
                    break;
                case 3:
                    System.out.println("Umum\t\t\t= 3000");
                    System.out.println("\n");
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    String jenistiket8 = input.next();
                    System.out.print("Jenis tiket yang ingin dibeli: ");
                    int jumlahtiket8 = input.nextInt();
                    if (jenistiket8.equals("Umum") || jenistiket8.equals("umum")) {
                        hargatiket = 3000 * jumlahtiket8;
                    }
                    break;
                default:
                    System.out.println("System Error");
                    break;
            }
        }
        System.out.println("=============================");
        System.out.println("\n");
        System.out.println(nama + ", pembelian kamu sebesar Rp " + hargatiket + " telah berhasil!");
        System.out.println("Tampilkan bukti pembayaran ke loket untuk menukarkan tiket");
    }
}
