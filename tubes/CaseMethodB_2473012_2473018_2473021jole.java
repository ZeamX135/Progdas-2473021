
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Case Method 2 [TUBES] Toko Baju Pria - Byte Collection
 *
 * @author 2473012-Kenneth Hansel
 * @author 2473018-Joshua Lewi
 * @author 2473021-Febrianus Leona Putra
 * @version 14 Januari 2024
 */
public class CaseMethodB_2473012_2473018_2473021jole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variabel & Fungsi
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
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
        int pemindah = 0;
        String tipePembayaran_real = "";
        String tipePackage_Real = "Kantung plastik";
        int harga_package = 0;
        int harga = 0;
        // Array untuk Daftar nama baju, size baju, harga baju
        String[][] daftarDanSize_baju1 = {{"Kaos Polos", "Kaos Kerah", "Kemeja Lengan Pendek", "Kemeja Lengan Panjang", "Hoodie", "Jaket"}, {"XS", "S", "M", "L", "XL", "XXL", "3XL"}};
        // Array List untuk daftar harga sesuai jenis baju dan sizenya.
        // 50.000-66.000 = kaos polos; 94.000-107.000 = kaos kerah; 150.000 - 170.000 = kemeja lengan pendek;
        // 170.000-185.000 = kemeja lengan panjang; 190.000-210.000 = kemeja lengan pendek; 250.000-300.000 = kemeja lengan panjang.
        int[][] harga_bajuSemua = {{50000, 55000, 60000, 66000},
        {94000, 96000, 100000, 107000},
        {150000, 152000, 160000, 170000, 177000, 179000, 185000},
        {190000, 195000, 201000, 206000, 210000},
        {250000, 260000, 270000, 290000, 300000}};
        // int[] stok_array = {}
        // Array List untuk daftar, size, harga dan jumlah baju.
        ArrayList<String> daftar_bajuReal = new ArrayList<String>();
        ArrayList<String> size_bajuReal = new ArrayList<String>();
        ArrayList<Integer> harga_bajuReal = new ArrayList<Integer>();
        ArrayList<Integer> jumlah_bajuReal = new ArrayList<Integer>();
        do {
            namaKasir = pilihlahKasir(sc);
            System.out.println("\n======================================================");
            do {
                // Pilihan pertama, jenis baju
                main_pilihan = firstChoice(sc);
                switch (main_pilihan) {
                    case 1:
                        sizing = ukuran1(sc, harga_bajuSemua, main_pilihan, harga_bajuReal);
                        tambahItem(daftar_bajuReal, size_bajuReal, daftarDanSize_baju1, sizing, main_pilihan, 0);
                        System.out.println("======================================================");
                        break;
                    case 2:
                        // Ukuran dan harga baju untuk "Kaos Berkerah"
                        sizing = ukuran1(sc, harga_bajuSemua, main_pilihan, harga_bajuReal);
                        tambahItem(daftar_bajuReal, size_bajuReal, daftarDanSize_baju1, sizing, main_pilihan, 0);
                        System.out.println("======================================================");
                        break;
                    case 3:
                        // Sub-pilihan kemeja (lengan panjang atau pendek)
                        System.out.println("1. Kemeja Lengan Pendek");
                        System.out.println("2. Kemeja Lengan Panjang");
                        do {
                            System.out.print("Pilihan anda (1/2): ");
                            first_pilihan = sc.nextInt();
                            if (first_pilihan < 1 || first_pilihan > 2) {
                                System.out.println("Input salah, mohon ulang kembali");
                            }
                        } while (first_pilihan < 1 || first_pilihan > 2);
                        System.out.println("======================================================");
                        switch (first_pilihan) {
                            case 1:
                                // Ukuran dan harga baju untuk "Kemeja Lengan Pendek"
                                sizing = ukuran1(sc, harga_bajuSemua, main_pilihan, harga_bajuReal);
                                tambahItem(daftar_bajuReal, size_bajuReal, daftarDanSize_baju1, sizing, main_pilihan, first_pilihan);
                                System.out.println("======================================================");
                                break;
                            case 2:
                                // Ukuran dan harga baju untuk "Kemeja Lengan Panjang"
                                System.out.println("\n====================== SIZING ========================");
                                System.out.println("1. || XS (Xtra Small)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0]));
                                System.out.println("2. || S (Small)\t\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0]));
                                System.out.println("3. || M (Medium)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0]));
                                System.out.println("4. || L (Large)\t\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0]));
                                System.out.println("5. || XL (Xtra Large)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][1]));
                                System.out.println("6. || XXL (2 Xtra Large) || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][2]));
                                System.out.println("7. || 3XL (3 Xtra Large) || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][3]));
                                do {
                                    System.out.print("Pilihan Size Anda (1-7): ");
                                    sizing = sc.nextInt();
                                    if (sizing <= 4 && sizing >= 1) {
                                        harga_bajuReal.add(harga_bajuSemua[main_pilihan - 1][0]);
                                    } else if (sizing == 5) {
                                        harga_bajuReal.add(harga_bajuSemua[main_pilihan - 1][1]);
                                    } else if (sizing == 6) {
                                        harga_bajuReal.add(harga_bajuSemua[main_pilihan - 1][2]);
                                    } else if (sizing == 7) {
                                        harga_bajuReal.add(harga_bajuSemua[main_pilihan - 1][3]);
                                    }
                                    if (sizing < 1 || sizing > 7) {
                                        System.out.println("Input tidak valid, mohon ulang kembali");
                                    }
                                } while (sizing < 1 || sizing > 7);
                                tambahItem(daftar_bajuReal, size_bajuReal, daftarDanSize_baju1, sizing, main_pilihan, first_pilihan);
                                System.out.println("======================================================");
                                break;
                        }
                        break;
                    case 4:
                        sizing = ukuran2(sc, harga_bajuSemua, main_pilihan, harga_bajuReal);
                        tambahItem(daftar_bajuReal, size_bajuReal, daftarDanSize_baju1, sizing, main_pilihan, 0);
                        System.out.println("======================================================");
                        break;
                    case 5:
                        sizing = ukuran2(sc, harga_bajuSemua, main_pilihan, harga_bajuReal);
                        tambahItem(daftar_bajuReal, size_bajuReal, daftarDanSize_baju1, sizing, main_pilihan, 0);
                        System.out.println("======================================================");
                        break;
                    default:
                }
                // Input jumlah itemnya
                do {
                    System.out.print("Masukkan jumlah item: ");
                    jumlah = sc.nextInt();
                    if (jumlah == 0) {
                        System.out.println("Jumlah item tidak boleh nol!");
                    }
                } while (jumlah == 0);
                jumlah_bajuReal.add(jumlah);
                // Input opsi tambah item atau tidaknya
                do {
                    System.out.print("Apakah Anda ingin menambah item? (Y/N): ");
                    yesno = sc.next().toLowerCase();
                    if (!yesno.equals("y") && !yesno.equals("n")) {
                        System.out.println("Input salah, mohon ulang kembali");
                    }
                } while (!yesno.equals("y") && !yesno.equals("n"));

            } while (yesno.equalsIgnoreCase("y"));
            System.out.println("======================================================");

            // Packaging (Jika transaksinya lebih dari 3 item, diberikan pilihan untuk menggunakan packaging ukuran large size)
            // Tote bag 15k, atau Kantong Plastik Biasa Rp. 500
            int a = 0;
            int penentuPackage = 0;
            while (a < jumlah_bajuReal.size()) {
                penentuPackage += jumlah_bajuReal.get(a);
                a += 1;
            }
            if (penentuPackage >= 3) {
                System.out.println(
                        "Karena jumlah item Anda 3 atau lebih, apakah Anda ingin menggunakan packaging lain?");
                System.out.println("1. Ya, (pindah ke tote bag besar, + Rp. 15.000)");
                System.out.println("2. Tidak, (tetap menggunakan kantong plastik besar, + Rp. 500)");
                do {
                    System.out.print("\nPilihan Anda (1/2): ");
                    tipePackage = sc.nextInt();
                    if (tipePackage < 1 || tipePackage > 2) {
                        System.out.println("Input tidak valid, mohon ulang kembali");
                    }
                } while (tipePackage < 1 || tipePackage > 2);
                if (tipePackage == 1) {
                    tipePackage_Real = "Tote Bag Besar";
                    harga_package = 15000;
                } else if (tipePackage == 2) {
                    tipePackage_Real = "Kantung plastik besar";
                    harga_package = 500;
                }
                System.out.println("======================================================");
            }

            for (int i = 0; i < daftar_bajuReal.size(); i++) {
                subtotal += jumlah_bajuReal.get(i) * harga_bajuReal.get(i);
            }

            // Diskon Dengan Syarat (>=300.000 = 5%, >=600.000 = 7%, >=900.000 = 10%)
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
            System.out.format("Total\t\t\t: Rp " + nf.format(total));
            System.out.println("\n======================================================");
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
                            System.out.format("Uang tunai yang Anda masukkan kurang Rp " + nf.format(total - tunai));
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
            hapusDuplikat(daftar_bajuReal, size_bajuReal, harga_bajuReal, jumlah_bajuReal);
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
                System.out.println(daftar_bajuReal.get(i) + " (" + size_bajuReal.get(i) + ")");
                System.out.format("%d x Rp%s \t: Rp%s%n", jumlah_bajuReal.get(i), nf.format(harga_bajuReal.get(i)),
                        nf.format(jumlah_bajuReal.get(i) * harga_bajuReal.get(i)));
            }
            System.out.println("------------------------------------------------------");

            System.out.format("Subtotal\t\t: Rp " + nf.format(subtotal));
            if (diskon != 0) {
                System.out.format("\nDiskon\t\t\t: Rp " + nf.format(diskon));
            }
            System.out.println("\nJenis Packaging\t\t: " + tipePackage_Real);
            System.out.format("Biaya Packaging\t\t: Rp " + nf.format(harga_package));

            total = subtotal + biaya_adm + harga_package - diskon;
            // untuk print tipe pembayarannya
            if (tipePembayaran == 2) {
                non_tunai = total;
                System.out.format("\nBiaya ADM\t\t: Rp " + nf.format(biaya_adm));
                System.out.format("\nTotal\t\t\t: Rp " + nf.format(total));
                System.out.format("\nBayar (" + tipePembayaran_real + ")\t: Rp " + nf.format(non_tunai));
            } else if (tipePembayaran == 1) {
                System.out.format("\nTotal\t\t\t: Rp " + nf.format(total));
                System.out.format("\nBayar (" + tipePembayaran_real + ")\t\t: Rp " + nf.format(tunai));
            }

            // Untuk mengeprint kembaliannya
            if (total < tunai) {
                kembalian = tunai - total;
                System.out.format("\nKembalian\t\t: Rp " + nf.format(kembalian));
            }
            System.out.println("\n======================================================");
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
            tunai = 0;

        } while (yesno1.equalsIgnoreCase("y"));
    }

    private static int firstChoice(Scanner sc) {
        // Pilihan pertama, jenis baju
        System.out.println("\n================= BYTE COLLECTION ====================");
        System.out.println("===== WELCOME, BYTERS! PILIH APA YANG KAMU MAU! ======");
        System.out.println("1. Kaos Polos");
        System.out.println("2. Kaos Kerah");
        System.out.println("3. Kemeja");
        System.out.println("4. Hoodie");
        System.out.println("5. Jacket");
        int pilihan_pertama;
        do {
            System.out.print("Pilihan anda (1-5): ");
            pilihan_pertama = sc.nextInt();
            if (pilihan_pertama < 1 || pilihan_pertama > 5) {
                System.out.println("Input tidak valid, mohon ulang kembali");
            }
            System.out.println("Pilihan Anda: " + pilihan_pertama); // Debug
            System.out.println("======================================================");
        } while (pilihan_pertama < 1 || pilihan_pertama > 5);
        return pilihan_pertama;
    }

    private static String pilihlahKasir(Scanner sc) {
        // Pilihan Nama Kasir
        int cashier;
        String namaCashier = "";
        System.out.println("Daftar Kasir:");
        System.out.println("1. Joshua Lewi");
        System.out.println("2. Kenneth Hansel");
        System.out.println("3. Febrianus Leona Putra");
        do {
            System.out.print("Silakan Pilih Kasir : ");
            cashier = sc.nextInt();
            if (cashier < 1 || cashier > 3) {
                System.out.println("Input tidak valid, mohon ulang kembali");
            }
        } while (cashier < 1 || cashier > 3);
        switch (cashier) {
            case 1:
                namaCashier = "Joshua Lewi";
                break;
            case 2:
                namaCashier = "Kenneth Hansel";
                break;
            case 3:
                namaCashier = "Febrianus Leona Putra";
                break;
        }
        return namaCashier;
    }

    private static int ukuran1(Scanner sc, int[][] harga_bajuSemua, int main_pilihan, ArrayList<Integer> harga_bajuReal) {
        // Ukuran dan harga baju untuk "Kaos Polos"
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        int pemindah = 0;
        int pilihanUkuran = 0;
        if (main_pilihan == 1) {
            pemindah = 0;
        } else if (main_pilihan == 2) {
            pemindah = 4;
        } else if (main_pilihan == 3) {
            pemindah = 8;
        }
        int ukuran;
        System.out.println("\n====================== SIZING ========================");
        System.out.println("1. || XS (Xtra Small)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0 + pemindah]));
        System.out.println("2. || S (Small)\t\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0 + pemindah]));
        System.out.println("3. || M (Medium)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0 + pemindah]));
        System.out.println("4. || L (Large)\t\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][1 + pemindah]));
        System.out.println("5. || XL (Xtra Large)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][1 + pemindah]));
        System.out.println("6. || XXL (2 Xtra Large) || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][2 + pemindah]));
        System.out.println("7. || 3XL (3 Xtra Large) || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][3 + pemindah]));
        do {
            System.out.print("Pilihan Size Anda (1-7): ");
            ukuran = sc.nextInt();
            harga_bajuReal.add(harga_bajuSemua[main_pilihan - 1][pilihanUkuran]);
            if (ukuran < 1 || ukuran > 7) {
                System.out.println("Input tidak valid, mohon ulang kembali");
            }
            if (ukuran <= 3 && ukuran >= 1) {
                pilihanUkuran = 0 + pemindah;
            } else if (ukuran == 4 || ukuran == 5) {
                pilihanUkuran = 1 + pemindah;
            } else if (ukuran == 6 || ukuran == 7) {
                pilihanUkuran = 2 + pemindah;
            }
        } while (ukuran < 1 || ukuran > 7);
        return ukuran;
    }

    private static int ukuran2(Scanner sc, int[][] harga_bajuSemua, int main_pilihan, ArrayList<Integer> harga_bajuReal) {
        // Ukuran dan harga bajunya
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        int pemindah = 0;
        int pilihanUkuran = 0;
        if (main_pilihan == 4) {
            pemindah = 0;
        } else if (main_pilihan == 5) {
            pemindah = 5;
        }
        int ukuran;
        System.out.println("\n====================== SIZING ========================");
        System.out.println("1. || XS (Xtra Small)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0 + pemindah]));
        System.out.println("2. || S (Small)\t\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][0 + pemindah]));
        System.out.println("3. || M (Medium)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][1 + pemindah]));
        System.out.println("4. || L (Large)\t\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][1 + pemindah]));
        System.out.println("5. || XL (Xtra Large)\t || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][2 + pemindah]));
        System.out.println("6. || XXL (2 Xtra Large) || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][3 + pemindah]));
        System.out.println("7. || 3XL (3 Xtra Large) || Rp. " + nf.format(harga_bajuSemua[main_pilihan - 1][4 + pemindah]));
        do {
            System.out.print("Pilihan Size Anda (1-7): ");
            ukuran = sc.nextInt();
            if (ukuran == 1 || ukuran == 2) {
                pilihanUkuran = 0 + pemindah;
            } else if (ukuran == 3 || ukuran == 4) {
                pilihanUkuran = 1 + pemindah;
            } else if (ukuran == 5) {
                pilihanUkuran = 2 + pemindah;
            } else if (ukuran == 6) {
                pilihanUkuran = 3 + pemindah;
            } else if (ukuran == 7) {
                pilihanUkuran = 4 + pemindah;
            }
            harga_bajuReal.add(harga_bajuSemua[main_pilihan - 1][pilihanUkuran]);
            if (ukuran < 1 || ukuran > 7) {
                System.out.println("Input tidak valid, mohon ulang kembali");
            }
        } while (ukuran < 1 || ukuran > 7);
        return ukuran;
    }

    private static void tambahItem(ArrayList<String> daftarBaju, ArrayList<String> sizeBaju, String[][] daftarDanSize_Baju1, int sizing, int main_pilihan, int subPilihan) {
        if (subPilihan == 1) {
            daftarBaju.add(daftarDanSize_Baju1[0][2]);
        } else if (subPilihan == 2) {
            daftarBaju.add(daftarDanSize_Baju1[0][3]);
        } else {
            daftarBaju.add(daftarDanSize_Baju1[0][main_pilihan - 1]);
        }
        if (sizing >= 1 && sizing <= 7) {
            sizeBaju.add(daftarDanSize_Baju1[1][sizing - 1]);
        }
    }

    private static void hapusDuplikat(ArrayList<String> daftarBaju, ArrayList<String> sizeBaju, ArrayList<Integer> hargaBaju, ArrayList<Integer> jumlahBaju) {
        for (int i = 0; i < daftarBaju.size(); i++) {
            for (int j = i + 1; j < daftarBaju.size(); j++) {
                if (daftarBaju.get(i).equals(daftarBaju.get(j)) && sizeBaju.get(i).equals(sizeBaju.get(j)) && hargaBaju.get(i).equals(hargaBaju.get(j))) {
                    jumlahBaju.set(i, jumlahBaju.get(i) + jumlahBaju.get(j));
                    daftarBaju.remove(j);
                    sizeBaju.remove(j);
                    hargaBaju.remove(j);
                    jumlahBaju.remove(j);
                }
            }
        }
    }
}
