/**
 * Pertemuan 04
 * [PRAKTIKUM] program yang dapat memeriksa kebenaran input data dari nilai test
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 12 Oktober 2024
 */
package pertemuan4.PR.PR04_2473021_JAVA;

import java.util.Random;
import java.util.Scanner;

public class A_HasilTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan nilai minimal test 1: ");
        int min1 = sc.nextInt();
        System.out.print("Masukkan nilai maksimal test 1: ");
        int max1 = sc.nextInt();
        System.out.print("Masukkan nilai minimal test 2: ");
        int min2 = sc.nextInt();
        System.out.print("Masukkan nilai maksimal test 2: ");
        int max2 = sc.nextInt();
        System.out.println("===============================\n");

        int hasil1 = 0;
        int hasil2 = 0;
        int hasil3 = 0;
        int hasil4 = 0;
        int hasil5 = 0;
        String status1 = "";
        String status2 = "";
        String status3 = "";
        String status4 = "";
        String status5 = "";
        int test1 = random.nextInt(3) + 1;
        System.out.print("Masukkan nilai untuk Test " + test1 + ": ");
        int nilai1 = sc.nextInt();
        switch (test1) {
            case 1:
                if (nilai1 >= min1 && nilai1 <= max1) {
                    hasil1 = max1 - nilai1;
                    status1 = "result is " + hasil1 + " from maximum value";
                } else {
                    status1 = "result invalid";
                }
                break;
            case 2:
                if (nilai1 >= min2 && nilai1 <= max2) {
                    hasil1 = max2 - nilai1;
                    status1 = "result is " + hasil1 + " from maximum value";
                } else {
                    status1 = "result invalid";
                }
                break;
            default:
                status1 = "not test 1 or 2";
        }
        int test2 = random.nextInt(3) + 1;
        System.out.print("Masukkan nilai untuk Test " + test2 + ": ");
        int nilai2 = sc.nextInt();
        switch (test2) {
            case 1:
                if (nilai2 >= min1 && nilai2 <= max1) {
                    hasil2 = max1 - nilai2;
                    status2 = "result is " + hasil2 + " from maximum value";
                } else {
                    status2 = "result invalid";
                }
                break;
            case 2:
                if (nilai2 >= min2 && nilai2 <= max2) {
                    hasil2 = max2 - nilai2;
                    status2 = "result is " + hasil2 + " from maximum value";
                } else {
                    status2 = "result invalid";
                }
                break;
            default:
                status2 = "not test 1 or 2";
        }
        int test3 = random.nextInt(3) + 1;
        System.out.print("Masukkan nilai untuk Test " + test3 + ": ");
        int nilai3 = sc.nextInt();
        switch (test3) {
            case 1:
                if (nilai3 >= min1 && nilai3 <= max1) {
                    hasil3 = max1 - nilai3;
                    status3 = "result is " + hasil3 + " from maximum value";
                } else {
                    status3 = "result invalid";
                }
                break;
            case 2:
                if (nilai3 >= min2 && nilai3 <= max2) {
                    hasil3 = max2 - nilai3;
                    status3 = "result is " + hasil3 + " from maximum value";
                } else {
                    status3 = "result invalid";
                }
                break;
            default:
                status3 = "not test 1 or 2";
        }
        int test4 = random.nextInt(3) + 1;
        System.out.print("Masukkan nilai untuk Test " + test4 + ": ");
        int nilai4 = sc.nextInt();
        switch (test4) {
            case 1:
                if (nilai4 >= min1 && nilai4 <= max1) {
                    hasil4 = max1 - nilai4;
                    status4 = "result is " + hasil4 + " from maximum value";
                } else {
                    status4 = "result invalid";
                }
                break;
            case 2:
                if (nilai4 >= min2 && nilai4 <= max2) {
                    hasil4 = max2 - nilai4;
                    status4 = "result is " + hasil4 + " from maximum value";
                } else {
                    status4 = "result invalid";
                }
                break;
            default:
                status4 = "not test 1 or 2";
        }
        int test5 = random.nextInt(3) + 1;
        System.out.print("Masukkan nilai untuk Test " + test5 + ": ");
        int nilai5 = sc.nextInt();
        switch (test5) {
            case 1:
                if (nilai5 >= min1 && nilai5 <= max1) {
                    hasil5 = max1 - nilai5;
                    status5 = "result is " + hasil5 + " from maximum value";
                } else {
                    status5 = "result invalid";
                }
                break;
            case 2:
                if (nilai5 >= min2 && nilai5 <= max2) {
                    hasil5 = max2 - nilai5;
                    status5 = "result is " + hasil5 + " from maximum value";
                } else {
                    status5 = "result invalid";
                }
                break;
            default:
                status5 = "not test 1 or 2";
        }
        System.out.print("===============================\n");

        System.out.println("\n========= Hasil Test ==========");
        System.out.println("Test    || Result       || Test Status");
        System.out.println(test1 + "       || " + nilai1 + "            || " + status1);
        System.out.println(test2 + "       || " + nilai2 + "            || " + status2);
        System.out.println(test3 + "       || " + nilai3 + "            || " + status3);
        System.out.println(test4 + "       || " + nilai4 + "            || " + status4);
        System.out.println(test5 + "       || " + nilai5 + "            || " + status5);

    }
}
