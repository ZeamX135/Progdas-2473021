package pertemuan2.Prak.PRAK02_2473021_JAVA;

import java.util.Scanner;

/**
 * Pertemuan 02
 * [PRAKTIKUM] Membuat Program True False
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 24 September 2024
 */

public class B_TrueFalse {
    public static void main(String[] args) {
        // input
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        int pertama = sc.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int kedua = sc.nextInt();
        System.out.print("Masukkan Angka Ketiga : ");
        int ketiga = sc.nextInt();

        // Process
        boolean kondisi1 = pertama > kedua && pertama > ketiga;
        boolean kondisi2 = pertama == ketiga;
        boolean kondisi3 = ketiga > pertama && ketiga > kedua;
        boolean kondisi4 = ketiga < kedua;
        boolean kondisi5 = pertama != kedua;
        boolean kondisi6 = pertama >= ketiga;
        boolean kondisi7 = pertama > ketiga;

        // Output
        System.out.println("-------------------------------------");
        System.out.println("==========Program True False=========");
        System.out.println("-------------------------------------");
        System.out.println("Angka pertama > dari kedua dan Ketiga");
        System.out.println(kondisi1);
        System.out.println("-------------------------------------");
        System.out.println("Angka Pertama = Angka ketiga");
        System.out.println(kondisi2);
        System.out.println("-------------------------------------");
        System.out.println("Angka Ketiga > dari Pertama dan Kedua");
        System.out.println(kondisi3);
        System.out.println("-------------------------------------");
        System.out.println("Angka Ketiga < dari Angka Kedua");
        System.out.println(kondisi4);
        System.out.println("-------------------------------------");
        System.out.println("Angka Pertama != angka kedua");
        System.out.println(kondisi5);
        System.out.println("-------------------------------------");
        System.out.println("Angka Pertama >= angka ketiga");
        System.out.println(kondisi6);
        System.out.println("-------------------------------------");
        System.out.println("Angka Pertama > angka ketiga");
        System.out.println(kondisi7);
        System.out.println("-------------------------------------");

        sc.close();
    }
}
