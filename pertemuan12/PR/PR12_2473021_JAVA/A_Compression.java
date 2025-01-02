/**
 * Pertemuan 12
 * [PR] Program yang dapat menyingkat input dengan format huruf-banyak huruf-huruf-banyak huruf-dst.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 15 Desember 2024
 */
package pertemuan12.PR.PR12_2473021_JAVA;

import java.util.Scanner;

public class A_Compression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String inputString = sc.nextLine();
        String compressedString = compressString(inputString);
        System.out.println("Compressed string: " + compressedString);
    }

    public static String compressString(String input) {
        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressedString.append(input.charAt(i - 1));
                compressedString.append(count);
                count = 1;
            }
        }
        compressedString.append(input.charAt(input.length() - 1));
        compressedString.append(count);

        return compressedString.toString();
    }
}
