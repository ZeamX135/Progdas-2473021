/**
 * Pertemuan 09
 * [PR] program yang meminta inputan dua deret bilangan bulat dan setiap deret disimpan ke dalam array masing-masing.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 24 November 2024
 */
package pertemuan9.PR.PR09_2473021_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class C_Urutan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input :");
        System.out.print("Deret 1 : ");
        String input1 = sc.nextLine();

        System.out.print("Deret 2 : ");
        String input2 = sc.nextLine();

        String[] split1 = input1.split(" ");
        String[] split2 = input2.split(" ");

        int[] deret1 = new int[split1.length];
        int[] deret2 = new int[split2.length];

        for (int i = 0; i < split1.length; i++) {
            deret1[i] = Integer.parseInt(split1[i]);
        }

        for (int i = 0; i < split2.length; i++) {
            deret2[i] = Integer.parseInt(split2[i]);
        }

        int deret1L = deret1.length;
        int deret2L = deret2.length;
        int deret3L = deret1L + deret2L;
        int[] gabungan = new int[deret3L];

        for (int i = 0; i < deret1L; i++) {
            gabungan[i] = deret1[i];
        }
        for (int i = 0; i < deret2L; i++) {
            gabungan[deret1L + i] = deret2[i];
        }

        int[] hasilTanpaDuplikat = new int[gabungan.length];
        int index = 0;

        for (int i = 0; i < gabungan.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (gabungan[i] == hasilTanpaDuplikat[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                hasilTanpaDuplikat[index++] = gabungan[i];
            }
        }
        int[] hasilAkhir = Arrays.copyOf(hasilTanpaDuplikat, index);
        Arrays.sort(hasilAkhir);

        System.out.println("Output :");
        System.out.println("Hasil list gabungan terurut tanpa angka duplikat: ");
        for (int num : hasilAkhir) {
            System.out.print(num + " ");
        }
    }
}
