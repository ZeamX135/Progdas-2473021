package belajarUTS;

import java.util.Random;
import java.util.Scanner;

public class persegi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("N: ");
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (i == 1 || j == 1 || i == input || j == input) {
                    System.out.print(" * ");
                } else {
                    int isi = rand.nextInt(10);
                    System.out.print(" " + isi + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
