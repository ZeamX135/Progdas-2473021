
/**
 * Pertemuan 11
 * [PR]  program untuk menghitung luas dan keliling
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 06 Desember 2024
 */
import java.util.Scanner;

public class B_HitungLuas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0;

        while (true) {
            System.out.println("\nPilih Luas");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Lingkaran");
            System.out.println("4. Luas Jajargenjang");

            System.out.print("Pilihan: ");
            String input = sc.nextLine();

            if (isInteger(input)) {
                pilih = Integer.parseInt(input);
                if (pilih >= 1 && pilih <= 4) {
                    break;
                } else {
                    System.out.println("Input tidak valid");
                }
            } else {
                System.out.println("Input tidak valid");
            }
        }

        switch (pilih) {
            case 1:
                luasPersegi(sc);
                break;
            case 2:
                luasPP(sc);
                break;
            case 3:
                luasLingkaran(sc);
                break;
            case 4:
                luasJajargenjang(sc);
                break;
        }

        sc.close();
    }

    private static boolean isInteger(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return !str.isEmpty();
    }

    private static void luasPersegi(Scanner sc) {
        System.out.print("Input Sisi: ");
        int sisi = Integer.parseInt(sc.nextLine());
        int luas = sisi * sisi;
        int keliling = 4 * sisi;
        System.out.println("Hasil Luas: " + luas);
        System.out.println("Hasil Keliling: " + keliling);
    }

    private static void luasPP(Scanner sc) {
        System.out.print("Input Panjang: ");
        int panjang = Integer.parseInt(sc.nextLine());
        System.out.print("Input Lebar: ");
        int lebar = Integer.parseInt(sc.nextLine());
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        System.out.println("Hasil Luas: " + luas);
        System.out.println("Hasil Keliling: " + keliling);
    }

    private static void luasLingkaran(Scanner sc) {
        System.out.print("Input Jari-jari: ");
        int jariJari = Integer.parseInt(sc.nextLine());
        double luas = 3.14 * jariJari * jariJari;
        double keliling = 2 * 3.14 * jariJari;
        System.out.println("Hasil Luas: " + luas);
        System.out.println("Hasil Keliling: " + keliling);
    }

    private static void luasJajargenjang(Scanner sc) {
        System.out.print("Input Alas: ");
        int alas = Integer.parseInt(sc.nextLine());
        System.out.print("Input Tinggi: ");
        int tinggi = Integer.parseInt(sc.nextLine());
        System.out.print("Input Sisi Miring: ");
        int sisiMiring = Integer.parseInt(sc.nextLine());
        int luas = alas * tinggi;
        int keliling = 2 * (alas + sisiMiring);
        System.out.println("Hasil Luas: " + luas);
        System.out.println("Hasil Keliling: " + keliling);
    }
}
