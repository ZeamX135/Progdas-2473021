package pertemuan1.PR.PR01_2473021_JAVA;

import java.util.Scanner;

public class B_Detik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Input Detik : ");
        Integer detikAwal = sc.nextInt();

        int jam = detikAwal/3600;
        int sisaDetik = detikAwal % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;
        
        System.out.println();
        System.out.println("Jumlah jam, menit dan detik sisa dari "+detikAwal+" detik : ");
        System.out.println(jam+ " jam "+menit+ " menit "+detik+ " detik");

        sc.close();
    }
}
