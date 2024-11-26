/**
 * Pertemuan 09
 * [PR] Program mengenai bahasa panda, dimana jika user menginput huruf kecil maka
 * outputnya juga huruf kecil dan jika user menginput huruf besar maka outputnya juga huruf besar
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 24 November 2024
 */
package pertemuan9.PR.PR09_2473021_JAVA;

import java.util.Scanner;

public class B_BahasaPanda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();

        String enkripsi = "";

        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            if (Character.isLowerCase(huruf)) {
                enkripsi += (char) ((huruf - 'a' + 6) % 26 + 'a');
            } else if (Character.isUpperCase(huruf)) {
                enkripsi += (char) ((huruf - 'A' + 6) % 26 + 'A');
            } else {
                enkripsi += huruf;
            }
        }
        System.out.println("Hasil Enkripsi: " + enkripsi);
        sc.close();
    }
}
