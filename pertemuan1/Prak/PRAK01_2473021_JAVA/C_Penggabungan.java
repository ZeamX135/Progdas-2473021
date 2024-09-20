package pertemuan1.Prak.PRAK01_2473021_JAVA;

import java.util.Scanner;

public class C_Penggabungan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kata Pertama\t: ");
        String pertama = sc.next();
        System.out.print("Kata Kedua\t: ");
        String kedua = sc.next();

        System.out.print("Output \t\t: " + pertama+" "+kedua );

        sc.close();
    }
}
