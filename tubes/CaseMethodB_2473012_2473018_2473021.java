import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Case Method 1 [TUBES] Toko Baju Pria - Byte Collection
 *
 * @author 2473012-Kenneth Hansel
 * @author 2473018-Joshua Lewi
 * @author 2473021-Febrianus Leona Putra
 * @version 29 Okt 2024
 */
public class CaseMethodB_2473012_2473018_2473021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variabel & Fungsi
        LocalDateTime tgl_tanggal = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String tanggal = tgl_tanggal.format(format1);
        String waktu = tgl_tanggal.format(format2);
        int main_pilihan;
        int first_pilihan;
        int sizing = 0;
        int total = 0;
        String namaKasir = "";
        int kasir;
        int jumlah;
        String yesno;
        String yesno1;
        int tipePembayaran;
        int tunai = 0;
        int non_tunai = 0;
        int kembalian = 0;
        int biaya_adm = 0;
        int subtotal = 0;
        int tipePackage = 0;
        int diskon = 0;
        String tipePembayaran_real = "";
        String tipePackage_Real = "Kantung plastik";
        int harga_package = 0;
        int harga = 0;
        // Array untuk Daftar nama baju, size baju, harga baju
        String[] daftar_baju1 = { "Kaos Polos", "Kaos Kerah", "Kemeja Lengan Panjang", "Kemeja Lengan Pendek", "Hoodie",
                "Jaket" };
        String[] size_baju1 = { "XS", "S", "M", "L", "XL", "XXL", "3XL" };
        int[] harga_baju1 = { 50000, 55000, 60000, 66000 };
        int[] harga_baju2 = { 94000, 96000, 100000, 107000 };
        int[] harga_baju3 = { 150000, 152000, 160000, 170000, 177000, 179000, 185000 };
        int[] harga_baju4 = { 190000, 195000, 201000, 206000, 210000 };
        int[] harga_baju5 = { 250000, 260000, 270000, 290000, 300000 };
        // Array List untuk daftar, size, harga dan jumlah baju.
        ArrayList<String> daftar_bajuReal = new ArrayList<String>();
        ArrayList<String> size_bajuReal = new ArrayList<String>();
        ArrayList<Integer> harga_bajuReal = new ArrayList<Integer>();
        ArrayList<Integer> jumlah_bajuReal = new ArrayList<Integer>();
        do {
            // Pilihan Nama Kasir
            System.out.println("Daftar Kasir:");
            System.out.println("1. Joshua Lewi");
            System.out.println("2. Kenneth Hansel");
            System.out.println("3. Febrianus Leona Putra");
            do {
                System.out.print("Silakan Pilih Kasir : ");
                kasir = sc.nextInt();
                if (kasir < 1 || kasir > 3) {
                    System.out.println("Input tidak valid, mohon ulang kembali");
                }
            } while (kasir < 1 || kasir > 3);
            switch (kasir) {
                case 1:
                    namaKasir = "Joshua Lewi";
                    break;
                case 2:
                    namaKasir = "Kenneth Hansel";
                    break;
                case 3:
                    namaKasir = "Febrianus Leona Putra";
                    break;
            }
            System.out.println("\n======================================================");

            do {
                // Pilihan pertama, jenis baju
                System.out.println("\n================= BYTE COLLECTION ====================");
                System.out.println("===== WELCOME, BYTERS! PILIH APA YANG KAMU MAU! ======");
                System.out.println("1. Kaos Polos");
                System.out.println("2. Kaos Kerah");
                System.out.println("3. Kemeja");
                System.out.println("4. Hoodie");
                System.out.println("5. Jacket");
                do {
                    System.out.print("Pilihan anda (1/2/3/4/5): ");
                    main_pilihan = sc.nextInt();
                    if (main_pilihan < 1 || main_pilihan > 5) {
                        System.out.println("Input tidak valid, mohon ulang kembali");
                    }
                    System.out.println("======================================================");
                } while (main_pilihan < 1 || main_pilihan > 5);
                switch (main_pilihan) {
                    case 1:
                        // Ukuran dan harga baju untuk "Kaos Polos"
                        System.out.println("\n====================== SIZING ========================");
                        System.out.println("1. XS (Xtra Small)\t: Rp. 50.000");
                        System.out.println("2. S (Small)\t\t: Rp. 50.000");
                        System.out.println("3. M (Medium)\t\t: Rp. 50.000");
                        System.out.println("4. L (Large)\t\t: Rp. 55.000");
                        System.out.println("5. XL (Xtra Large)\t: Rp. 55.000");
                        System.out.println("6. XXL (2 Xtra Large)\t: Rp. 60.000");
                        System.out.println("7. 3XL (3 Xtra Large)\t: Rp. 66.000");
                        do {
                            System.out.print("Pilihan Size Anda (1/2/3/4/5/6/7): ");
                            sizing = sc.nextInt();
                            if (sizing < 1 || sizing > 7) {
                                System.out.println("Input tidak valid, mohon ulang kembali");
                            }
                        } while (sizing < 1 || sizing > 7);
                        daftar_bajuReal.add(daftar_baju1[0]);
                        if (sizing == 1) {
                            size_bajuReal.add(size_baju1[0]);
                            harga_bajuReal.add(harga_baju1[0]);
                        } else if (sizing == 2) {
                            size_bajuReal.add(size_baju1[1]);
                            harga_bajuReal.add(harga_baju1[0]);
                        } else if (sizing == 3) {
                            size_bajuReal.add(size_baju1[2]);
                            harga_bajuReal.add(harga_baju1[0]);
                        } else if (sizing == 4) {
                            size_bajuReal.add(size_baju1[3]);
                            harga_bajuReal.add(harga_baju1[1]);
                        } else if (sizing == 5) {
                            size_bajuReal.add(size_baju1[4]);
                            harga_bajuReal.add(harga_baju1[1]);
                        } else if (sizing == 6) {
                            size_bajuReal.add(size_baju1[5]);
                            harga_bajuReal.add(harga_baju1[2]);
                        } else if (sizing == 7) {
                            size_bajuReal.add(size_baju1[6]);
                            harga_bajuReal.add(harga_baju1[3]);
                        }
                        System.out.println("======================================================");
                        break;
                    case 2:
                        // Ukuran dan harga baju untuk "Kaos Berkerah"
                        System.out.println("\n====================== SIZING ========================");
                        System.out.println("1. XS (Xtra Small)\t: Rp. 94.000");
                        System.out.println("2. S (Small)\t\t: Rp. 94.000");
                        System.out.println("3. M (Medium)\t\t: Rp. 94.000");
                        System.out.println("4. L (Large)\t\t: Rp. 96.000");
                        System.out.println("5. XL (Xtra Large)\t: Rp. 96.000");
                        System.out.println("6. XXL (2 Xtra Large)\t: Rp. 100.000");
                        System.out.println("7. 3XL (3 Xtra Large)\t: Rp. 107.000");
                        do {
                            System.out.print("Pilihan Size Anda (1/2/3/4/5/6/7): ");
                            sizing = sc.nextInt();
                            if (sizing < 1 || sizing > 7) {
                                System.out.println("Input tidak valid, mohon ulang kembali");
                            }
                        } while (sizing < 1 || sizing > 7);
                        daftar_bajuReal.add(daftar_baju1[1]);
                        if (sizing == 1) {
                            size_bajuReal.add(size_baju1[0]);
                            harga_bajuReal.add(harga_baju2[0]);
                        } else if (sizing == 2) {
                            size_bajuReal.add(size_baju1[1]);
                            harga_bajuReal.add(harga_baju2[0]);
                        } else if (sizing == 3) {
                            size_bajuReal.add(size_baju1[2]);
                            harga_bajuReal.add(harga_baju2[0]);
                        } else if (sizing == 4) {
                            size_bajuReal.add(size_baju1[3]);
                            harga_bajuReal.add(harga_baju2[1]);
                        } else if (sizing == 5) {
                            size_bajuReal.add(size_baju1[4]);
                            harga_bajuReal.add(harga_baju2[1]);
                        } else if (sizing == 6) {
                            size_bajuReal.add(size_baju1[5]);
                            harga_bajuReal.add(harga_baju2[2]);
                        } else if (sizing == 7) {
                            size_bajuReal.add(size_baju1[6]);
                            harga_bajuReal.add(harga_baju2[3]);
                        }
                        System.out.println("======================================================");
                        break;
                    case 3:
                        // Sub-pilihan kemeja (lengan panjang atau pendek)
                        System.out.println("1. Kemeja Lengan Panjang");
                        System.out.println("2. Kemeja Lengan Pendek");
                        do {
                            System.out.print("Pilihan anda (1/2): ");
                            first_pilihan = sc.nextInt();
                            if (first_pilihan < 1 || first_pilihan > 2) {
                                System.out.println("Input salah, ulang");
                            }
                        } while (first_pilihan < 1 || first_pilihan > 2);
                        System.out.println("======================================================");
                        switch (first_pilihan) {
                            case 1:
                                // Ukuran dan harga baju untuk "Kemeja Lengan Panjang"
                                System.out.println("\n====================== SIZING ========================");
                                System.out.println("1. XS (Xtra Small)\t: Rp. 170.000");
                                System.out.println("2. S (Small)\t\t: Rp. 170.000");
                                System.out.println("3. M (Medium)\t\t: Rp. 170.000");
                                System.out.println("4. L (Large)\t\t: Rp. 170.000");
                                System.out.println("5. XL (Xtra Large)\t: Rp. 177.000");
                                System.out.println("6. XXL (2 Xtra Large)\t: Rp. 179.000");
                                System.out.println("7. 3XL (3 Xtra Large)\t: Rp. 185.000");
                                do {
                                    System.out.print("Pilihan Size Anda (1/2/3/4/5/6/7): ");
                                    sizing = sc.nextInt();
                                    if (sizing < 1 || sizing > 7) {
                                        System.out.println("Input salah, ulang");
                                    }
                                } while (sizing < 1 || sizing > 7);
                                daftar_bajuReal.add(daftar_baju1[2]);
                                if (sizing == 1) {
                                    size_bajuReal.add(size_baju1[0]);
                                    harga_bajuReal.add(harga_baju3[0]);
                                } else if (sizing == 2) {
                                    size_bajuReal.add(size_baju1[1]);
                                    harga_bajuReal.add(harga_baju3[0]);
                                } else if (sizing == 3) {
                                    size_bajuReal.add(size_baju1[2]);
                                    harga_bajuReal.add(harga_baju3[0]);
                                } else if (sizing == 4) {
                                    size_bajuReal.add(size_baju1[3]);
                                    harga_bajuReal.add(harga_baju3[1]);
                                } else if (sizing == 5) {
                                    size_bajuReal.add(size_baju1[4]);
                                    harga_bajuReal.add(harga_baju3[1]);
                                } else if (sizing == 6) {
                                    size_bajuReal.add(size_baju1[5]);
                                    harga_bajuReal.add(harga_baju3[2]);
                                } else if (sizing == 7) {
                                    size_bajuReal.add(size_baju1[6]);
                                    harga_bajuReal.add(harga_baju3[3]);
                                }
                                System.out.println("======================================================");
                                break;
                            case 2:
                                // Ukuran dan harga baju untuk "Kemeja Lengan Pendek"
                                System.out.println("\n====================== SIZING ========================");
                                System.out.println("1. XS (Xtra Small)\t: Rp. 150.000");
                                System.out.println("2. S (Small)\t\t: Rp. 150.000");
                                System.out.println("3. M (Medium)\t\t: Rp. 150.000");
                                System.out.println("4. L (Large)\t\t: Rp. 152.000");
                                System.out.println("5. XL (Xtra Large)\t: Rp. 152.000");
                                System.out.println("6. XXL (2 Xtra Large)\t: Rp. 160.000");
                                System.out.println("7. 3XL (3 Xtra Large)\t: Rp. 170.000");
                                do {
                                    System.out.print("Pilihan Size Anda (1/2/3/4/5/6/7): ");
                                    sizing = sc.nextInt();
                                    if (sizing < 1 || sizing > 7) {
                                        System.out.println("Input salah, ulang");
                                    }
                                } while (sizing < 1 || sizing > 7);
                                daftar_bajuReal.add(daftar_baju1[3]);
                                if (sizing == 1) {
                                    size_bajuReal.add(size_baju1[0]);
                                    harga_bajuReal.add(harga_baju3[3]);
                                } else if (sizing == 2) {
                                    size_bajuReal.add(size_baju1[1]);
                                    harga_bajuReal.add(harga_baju3[3]);
                                } else if (sizing == 3) {
                                    size_bajuReal.add(size_baju1[2]);
                                    harga_bajuReal.add(harga_baju3[3]);
                                } else if (sizing == 4) {
                                    size_bajuReal.add(size_baju1[3]);
                                    harga_bajuReal.add(harga_baju3[3]);
                                } else if (sizing == 5) {
                                    size_bajuReal.add(size_baju1[4]);
                                    harga_bajuReal.add(harga_baju3[4]);
                                } else if (sizing == 6) {
                                    size_bajuReal.add(size_baju1[5]);
                                    harga_bajuReal.add(harga_baju3[5]);
                                } else if (sizing == 7) {
                                    size_bajuReal.add(size_baju1[6]);
                                    harga_bajuReal.add(harga_baju3[6]);
                                }
                                System.out.println("======================================================");
                                break;
                        }
                        break;
                    case 4:
                        // Ukuran dan harga baju untuk "Hoodie"
                        System.out.println("\n====================== SIZING ========================");
                        System.out.println("1. XS (Xtra Small)\t: Rp. 190.000");
                        System.out.println("2. S (Small)\t\t: Rp. 190.000");
                        System.out.println("3. M (Medium)\t\t: Rp. 195.000");
                        System.out.println("4. L (Large)\t\t: Rp. 195.000");
                        System.out.println("5. XL (Xtra Large)\t: Rp. 201.000");
                        System.out.println("6. XXL (2 Xtra Large)\t: Rp. 206.000");
                        System.out.println("7. 3XL (3 Xtra Large)\t: Rp. 210.000");
                        do {
                            System.out.print("Pilihan Size Anda (1/2/3/4/5/6/7): ");
                            sizing = sc.nextInt();
                            if (sizing < 1 || sizing > 7) {
                                System.out.println("Input salah, ulang");
                            }
                        } while (sizing < 1 || sizing > 7);
                        daftar_bajuReal.add(daftar_baju1[4]);
                        if (sizing == 1) {
                            size_bajuReal.add(size_baju1[0]);
                            harga_bajuReal.add(harga_baju4[0]);
                        } else if (sizing == 2) {
                            size_bajuReal.add(size_baju1[1]);
                            harga_bajuReal.add(harga_baju4[0]);
                        } else if (sizing == 3) {
                            size_bajuReal.add(size_baju1[2]);
                            harga_bajuReal.add(harga_baju4[1]);
                        } else if (sizing == 4) {
                            size_bajuReal.add(size_baju1[3]);
                            harga_bajuReal.add(harga_baju4[1]);
                        } else if (sizing == 5) {
                            size_bajuReal.add(size_baju1[4]);
                            harga_bajuReal.add(harga_baju4[2]);
                        } else if (sizing == 6) {
                            size_bajuReal.add(size_baju1[5]);
                            harga_bajuReal.add(harga_baju4[3]);
                        } else if (sizing == 7) {
                            size_bajuReal.add(size_baju1[6]);
                            harga_bajuReal.add(harga_baju4[4]);
                        }
                        System.out.println("======================================================");
                        break;
                    case 5:
                        // Ukuran dan harga baju untuk "Jacket"
                        System.out.println("\n====================== SIZING ========================");
                        System.out.println("1. XS (Xtra Small)\t: Rp. 250.000");
                        System.out.println("2. S (Small)\t\t: Rp. 250.000");
                        System.out.println("3. M (Medium)\t\t: Rp. 260.000");
                        System.out.println("4. L (Large)\t\t: Rp. 260.000");
                        System.out.println("5. XL (Xtra Large)\t: Rp. 270.000");
                        System.out.println("6. XXL (2 Xtra Large)\t: Rp. 290.000");
                        System.out.println("7. 3XL (3 Xtra Large)\t: Rp. 300.000");
                        do {
                            System.out.print("Pilihan Size Anda (1/2/3/4/5/6/7): ");
                            sizing = sc.nextInt();
                            if (sizing < 1 || sizing > 7) {
                                System.out.println("Input salah, ulang");
                            }
                        } while (sizing < 1 || sizing > 7);
                        daftar_bajuReal.add(daftar_baju1[5]);
                        if (sizing == 1) {
                            size_bajuReal.add(size_baju1[0]);
                            harga_bajuReal.add(harga_baju5[0]);
                        } else if (sizing == 2) {
                            size_bajuReal.add(size_baju1[1]);
                            harga_bajuReal.add(harga_baju5[0]);
                        } else if (sizing == 3) {
                            size_bajuReal.add(size_baju1[2]);
                            harga_bajuReal.add(harga_baju5[1]);
                        } else if (sizing == 4) {
                            size_bajuReal.add(size_baju1[3]);
                            harga_bajuReal.add(harga_baju5[1]);
                        } else if (sizing == 5) {
                            size_bajuReal.add(size_baju1[4]);
                            harga_bajuReal.add(harga_baju5[2]);
                        } else if (sizing == 6) {
                            size_bajuReal.add(size_baju1[5]);
                            harga_bajuReal.add(harga_baju5[3]);
                        } else if (sizing == 7) {
                            size_bajuReal.add(size_baju1[6]);
                            harga_bajuReal.add(harga_baju5[4]);
                        }
                        System.out.println("======================================================");
                        break;
                    default:
                }
                // Input jumlah itemnya
                do {
                System.out.print("Masukkan jumlah item: ");
                jumlah = sc.nextInt();
                if (jumlah == 0){
                    System.out.println("Jumlah item tidak boleh nol!");
                }
                } while (jumlah == 0);
                jumlah_bajuReal.add(jumlah);
                // Input opsi tambah item atau tidaknya
                do {
                    System.out.print("Apakah Anda ingin menambah item? (Y/N): ");
                    yesno = sc.next().toLowerCase();
                    if (!yesno.equals("y") && !yesno.equals("n")) {
                        System.out.println("Input salah, ulang lagi");
                    }
                } while (!yesno.equals("y") && !yesno.equals("n"));
                // Packaging
                int a = 0;
                int penentuPackage = 0;
                while (a < jumlah_bajuReal.size()) {
                    penentuPackage += jumlah_bajuReal.get(a);
                    a += 1;
                }
                if (penentuPackage >= 3) {
                    System.out.println("\n======================================================");
                    System.out.println(
                            "Karena jumlah item Anda 3 atau lebih, apakah Anda ingin menggunakan packaging lain?");
                    System.out.println("1. Ya, (pindah ke paper bag, + Rp. 3.000)");
                    System.out.println("2. Tidak, (tetap menggunakan kantong plastik besar, + Rp. 500)");
                    do {
                        System.out.print("\nPilihan Anda (1/2): ");
                        tipePackage = sc.nextInt();
                        if (tipePackage < 1 || tipePackage > 2) {
                            System.out.println("Input tidak valid, mohon ulang kembali");
                        }
                    } while (tipePackage < 1 || tipePackage > 2);
                    if (tipePackage == 1) {
                        tipePackage_Real = "Paper Bag Besar";
                        harga_package = 3000;
                    } else if (tipePackage == 2) {
                        tipePackage_Real = "Kantung plastik besar";
                        harga_package = 500;
                    }
                }
            } while (yesno.equalsIgnoreCase("y"));
            System.out.println("======================================================");

            for (int i = 0; i < daftar_bajuReal.size(); i++) {
                subtotal += jumlah_bajuReal.get(i) * harga_bajuReal.get(i);
            }
            if (subtotal >= 300000) {
                if (subtotal >= 900000) {
                    diskon = subtotal * 10 / 100;
                } else if (subtotal >= 600000) {
                    diskon = subtotal * 7 / 100;
                } else if (subtotal >= 300000) {
                    diskon = subtotal * 5 / 100;
                }
            }
            total = subtotal + biaya_adm - diskon + harga_package;
            System.out.format("Total\t\t\t: Rp" + "%,7d%n", total);
            System.out.println("======================================================");
            System.out.println("1. Tunai");
            System.out.println("2. Non-Tunai");
            do {
                System.out.print("Masukkan tipe pembayaran (1/2): ");
                tipePembayaran = sc.nextInt();
                if (tipePembayaran < 1 || tipePembayaran > 2) {
                    System.out.println("Input tidak valid, mohon ulang kembali");
                }
            } while (tipePembayaran < 1 || tipePembayaran > 2);
            System.out.println("======================================================");
            switch (tipePembayaran) {
                case 1:
                    do {
                        System.out.print("Masukkan tunai (Rp): ");
                        tunai = sc.nextInt();
                        if (tunai < total) {
                            System.out.format("Uang tunai yang Anda masukkan kurang Rp" + "%,7d%n", (total - tunai));
                            System.out.println("");
                        }
                    } while (tunai < total);
                    biaya_adm = 0;
                    tipePembayaran_real = "Tunai";
                    break;
                case 2:
                    biaya_adm = 1000;
                    tipePembayaran_real = "Non-Tunai";
                    break;
            }

            // OUTPUT STRUK
            System.out.println("\n\n======================================================");
            // Detail alamatnya, tanggal, waktu dan kasirnya
            System.out.println("================= BYTE COLLECTION ====================");
            System.out.println("  Jl. Surya Sumantri No.65, Sukawarna, Kota Bandung   ");
            System.out.println("======================================================");
            System.out.println("Tanggal\t: " + tanggal);
            System.out.println("Waktu\t: " + waktu);
            System.out.println("Kasir\t: " + namaKasir);
            System.out.println("======================================================");
            // untuk mengeprint item apa saja yang dibeli oleh user (berapa jumlah itemnya
            // dan apa saja yang dibeli)
            for (int i = 0; i < daftar_bajuReal.size(); i++) {
                System.out.println(daftar_bajuReal.get(i) + "(" + size_bajuReal.get(i) + ")");
                System.out.format("%d x Rp%,7d \t: Rp%,7d%n", jumlah_bajuReal.get(i), harga_bajuReal.get(i),
                        jumlah_bajuReal.get(i) * harga_bajuReal.get(i));
            }
            System.out.println("------------------------------------------------------");

            System.out.format("Subtotal\t\t: Rp" + "%,7d%n", subtotal);
            if (diskon != 0) {
                System.out.format("Diskon\t\t\t: Rp" + "%,7d%n", diskon);
            }
            System.out.println("Jenis Packaging\t\t: " + tipePackage_Real);
            System.out.format("Biaya Packaging\t\t: Rp" + "%,7d%n", harga_package);

            total = subtotal + biaya_adm + harga_package - diskon;
            // untuk print tipe pembayarannya
            if (tipePembayaran == 2) {
                non_tunai = total;
                System.out.format("Biaya ADM\t\t: Rp" + "%,7d%n", biaya_adm);
                System.out.format("Total\t\t\t: Rp" + "%,7d%n", total);
                System.out.format("Bayar (" + tipePembayaran_real + ")\t: Rp" + "%,7d%n", non_tunai);
            } else if (tipePembayaran == 1) {
                System.out.format("Total\t\t\t: Rp" + "%,7d%n", total);
                System.out.format("Bayar (" + tipePembayaran_real + ")\t\t: Rp" + "%,7d%n", tunai);
            }

            // Untuk mengeprint kembaliannya
            if (total < tunai) {
                kembalian = tunai - total;
                System.out.format("Kembalian\t\t: Rp" + "%,7d%n", kembalian);
            }
            System.out.println("======================================================");
            System.out.println("=========== TERIMA KASIH TELAH BERBELANJA! ===========");
            System.out.println("======================================================");

            // Pilihan Transaksi baru (diluar struk)
            do {
                System.out.print("\nApakah Anda Mau Membuat Transaksi Baru? (Y/N): ");
                yesno1 = sc.next().toLowerCase();
                if (!yesno1.equals("y") && !yesno1.equals("n")) {
                    System.out.println("Input tidak valid, mohon ulang kembali");
                }
            } while (!yesno1.equals("y") && !yesno1.equals("n"));

            // Untuk mengclear isi array list sebelumnya
            subtotal = 0;
            daftar_bajuReal.clear();
            size_bajuReal.clear();
            harga_bajuReal.clear();
            jumlah_bajuReal.clear();
            tipePackage_Real = "Kantung plastik";
            harga_package = 0;

        } while (yesno1.equalsIgnoreCase("y"));

    }
}