/**
 * Pertemuan 09
 * [PRAKTIKUM]  Program Gambaran sederhana tentang enkripsi, misalnya mengganti huruf a dengan j, b dengan k dan seterusnya
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 19 Oktober 2024
 */
package pertemuan9.Prak.PRAK01_2473021_JAVA;

import java.util.Scanner;

public class C_ChaesarChipper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String kalimat = sc.nextLine();

        char[] tabelSubstitusi = {
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C',
            'D', 'E', 'F', 'G', 'H', 'I'
        };

        StringBuilder terenkripsi = new StringBuilder();

        for (char c : kalimat.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    terenkripsi.append(tabelSubstitusi[c - 'A']);
                } else {
                    terenkripsi.append(Character.toLowerCase(tabelSubstitusi[c - 'a']));
                }
            } else if (c == ' ') {
                terenkripsi.append('%');
            } else {
                terenkripsi.append('$');
            }
        }

        String teksTerenkripsi = terenkripsi.toString();
        System.out.println("Hasil Enkripsi: " + teksTerenkripsi);

        sc.close();
    }
}
