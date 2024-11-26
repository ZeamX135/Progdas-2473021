/**
 * Pertemuan 10
 * [PRAKTIKUM] program yang menggunakan array 2 dimensi untuk melakukan rotasi matriks berukuran N x N searah dan berlawanan arah jarum jam.
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 26 November 2024
 */
package pertemuan10.Prak.PRAK10_2473021_JAVA;

import java.util.Scanner;

public class A_RotasiMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan ukuran matriks (N x N): ");
        int ukuran = sc.nextInt();

        int[][] matriks = new int[ukuran][ukuran];
        System.out.println("Masukkan elemen-elemen matriks:");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        int[][] temp = new int[ukuran][ukuran];
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                temp[j][ukuran - 1 - i] = matriks[i][j];
            }
        }
        System.out.println("Matriks setelah rotasi 90 derajat (searah jarum jam):");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

        int[][] temp2 = new int[ukuran][ukuran];
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                temp2[ukuran - 1 - j][i] = matriks[i][j];
            }
        }
        System.out.println("Matriks setelah rotasi 90 derajat (berlawanan arah jarum jam):");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print(temp2[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
