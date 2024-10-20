/**
 * Pertemuan 05
 * [PRAKTIKUM] program yang dapat menghitung jumlah huruf vokal dan tanda spasi dari inputan sebuah kalimat
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 15 Oktober 2024
 */
package pertemuan5.Prak.PRAK05_2473021_JAVA;

import java.util.Scanner;

public class B_Vokal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();

        char check;
        int a = 0;
        int i = 0;
        int u = 0;
        int e = 0;
        int o = 0;
        int sps = 0;
        for (int j = 0; j < kalimat.length(); j++) {
            check = kalimat.charAt(j);
            switch (check) {
                case 'a':
                    a++;
                    break;
                case 'A':
                    a++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'u':
                    u++;
                    break;
                case 'U':
                    u++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'O':
                    o++;
                    break;
                case ' ':
                    sps++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("===========================================================");
        System.out.println("Kalimat : " + kalimat);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Huruf Vokal |   a/A\ti/I\tu/U\te/E\to/O\tSps");
        System.out.println("Jumlah      |    " + a + "\t " + i + "\t " + u + "\t " + e + "\t " + o + "\t " + sps);
    }
}
