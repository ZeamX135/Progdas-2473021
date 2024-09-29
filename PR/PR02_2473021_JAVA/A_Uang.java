/**
 * Pertemuan 02
 * [PR] Membuat Program Konversi Uang dari rupiah ke Dollar Amerika(USD) dan EURO (EUR)
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 29 September 2024
 */

package PR.PR02_2473021_JAVA;

import java.util.Scanner;

public class A_Uang {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.println(".......:=Konversi Mata Uang=:.......");
        System.out.print("jumlah uang dalam Rupiah: Rp ");
        double rupiah = sc.nextDouble();

        // Process
        double usd = rupiah*0.06601;
        double eur = rupiah*0.05913;

        // Output
        System.out.println("Dolar Amerika (USD)     : " + usd);
        System.out.println("Euro (EUR)              : " + eur);

        sc.close();
    }
}
