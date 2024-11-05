package pertemuan6.Teori;

import java.util.Scanner;

public class referensiTubes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String selectedItems = ""; // Untuk menyimpan produk yang dipilih
        int categoryChoice;
        int itemChoice;
        int subItemChoice;
        boolean continueShopping = true;

        while (continueShopping) {
            // Menu Kategori Utama (Atasan, Bawahan, Aksesoris)
            System.out.println("\nKategori Toko Baju Online:");
            System.out.println("1. Atasan");
            System.out.println("2. Bawahan");
            System.out.println("3. Aksesoris");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan kategori Anda: ");
            categoryChoice = input.nextInt();

            switch (categoryChoice) {
                case 1: // Atasan
                    itemChoice = -1; // Reset pilihan item
                    while (itemChoice != 0) {
                        System.out.println("\nSubmenu Atasan:");
                        System.out.println("1. Jaket");
                        System.out.println("2. Kaos");
                        System.out.println("3. Kemeja");
                        System.out.println("0. Kembali ke Kategori");
                        System.out.print("Masukkan pilihan item Atasan Anda: ");
                        itemChoice = input.nextInt();

                        switch (itemChoice) {
                            case 1: // Jaket
                                selectedItems += "Jaket\n";
                                subItemChoice = -1; // Reset pilihan subitem

                                // Submenu untuk Jaket
                                while (subItemChoice != 0) {
                                    System.out.println("\nPilihan untuk Jaket:");
                                    System.out.println("1. Jaket Kulit");
                                    System.out.println("2. Jaket Parka");
                                    System.out.println("0. Kembali ke Atasan");
                                    System.out.print("Masukkan pilihan Anda: ");
                                    subItemChoice = input.nextInt();

                                    switch (subItemChoice) {
                                        case 1:
                                            selectedItems += " - Jaket Kulit\n";
                                            break;
                                        case 2:
                                            selectedItems += " - Jaket Parka\n";
                                            break;
                                        case 0:
                                            System.out.println("Kembali ke Atasan.");
                                            break;
                                        default:
                                            System.out.println("Pilihan tidak valid.");
                                    }
                                }
                                break;

                            case 2: // Kaos
                                selectedItems += "Kaos\n";
                                break;

                            case 3: // Kemeja
                                selectedItems += "Kemeja\n";
                                break;

                            case 0: // Kembali ke kategori
                                break;

                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;

                case 2: // Bawahan
                    itemChoice = -1; // Reset pilihan item
                    while (itemChoice != 0) {
                        System.out.println("\nSubmenu Bawahan:");
                        System.out.println("1. Celana Jeans");
                        System.out.println("2. Rok");
                        System.out.println("3. Celana Pendek");
                        System.out.println("0. Kembali ke Kategori");
                        System.out.print("Masukkan pilihan item Bawahan Anda: ");
                        itemChoice = input.nextInt();

                        switch (itemChoice) {
                            case 1:
                                selectedItems += "Celana Jeans\n";
                                break;
                            case 2:
                                selectedItems += "Rok\n";
                                break;
                            case 3:
                                selectedItems += "Celana Pendek\n";
                                break;
                            case 0:
                                break; // Kembali ke kategori
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;

                case 3: // Aksesoris
                    itemChoice = -1; // Reset pilihan item
                    while (itemChoice != 0) {
                        System.out.println("\nSubmenu Aksesoris:");
                        System.out.println("1. Topi");
                        System.out.println("2. Jam Tangan");
                        System.out.println("3. Kacamata");
                        System.out.println("0. Kembali ke Kategori");
                        System.out.print("Masukkan pilihan item Aksesoris Anda: ");
                        itemChoice = input.nextInt();

                        switch (itemChoice) {
                            case 1:
                                selectedItems += "Topi\n";
                                break;
                            case 2:
                                selectedItems += "Jam Tangan\n";
                                break;
                            case 3:
                                selectedItems += "Kacamata\n";
                                break;
                            case 0:
                                break; // Kembali ke kategori
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;

                case 0: // Keluar
                    continueShopping = false;
                    break;

                default:
                    System.out.println("Pilihan kategori tidak valid.");
            }

            // Tanya apakah pengguna ingin menambah produk
            if (continueShopping) {
                System.out.println("\nApakah Anda ingin menambah produk? (y/n)");
                char addMore = input.next().charAt(0);
                if (addMore == 'n' || addMore == 'N') {
                    continueShopping = false; // Mengakhiri loop jika tidak ingin menambah produk
                }
            }
        }

        // Menampilkan hasil produk yang dipilih
        System.out.println("\nProduk yang Anda pilih:");
        if (selectedItems.isEmpty()) {
            System.out.println("Anda tidak memilih produk apa pun.");
        } else {
            System.out.println(selectedItems); // Menampilkan semua produk yang dipilih
        }

        System.out.println("Terima kasih telah berbelanja di toko kami.");
        input.close();
    }
}
