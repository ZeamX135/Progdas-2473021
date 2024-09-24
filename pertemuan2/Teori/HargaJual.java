package pertemuan2.Teori;

import java.util.Scanner;

public class HargaJual {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan harga : ");
        double hrgBeli = sc.nextDouble();

        //Proses
        final float keuntunganKotor = 0.2f;
        double hrgJual = hrgBeli + (hrgBeli* keuntunganKotor);

        //Output
        System.out.println("Harga beli " + hrgBeli);
        System.out.println("Harga jual " + hrgJual);

        sc.close();
    }
}
