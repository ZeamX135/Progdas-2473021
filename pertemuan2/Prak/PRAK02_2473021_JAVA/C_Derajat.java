package pertemuan2.Prak.PRAK02_2473021_JAVA;

import java.util.Scanner;

/**
 * Pertemuan 02
 * [PRAKTIKUM] Membuat Program Derajat
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 24 September 2024
 */

public class C_Derajat {
    public static void main(String[] args) {
        // Input
        Scanner sc=new Scanner(System.in);
        System.out.println(".:=Sistem Converter Suhu=:.");
        System.out.println("***************************");
        System.out.print("Reamur          : ");
        double reamur = sc.nextDouble();

        // Process
        double celcius = 5.0 / 4 * reamur;
        double kelvin = celcius + 273;
        double fahrenheit = (9.0 / 4 * reamur) + 32;

        // Output
        System.out.println("Celcius         : " + celcius);
        System.out.println("Kelvin          : " + kelvin);
        System.out.println("Fahrenheit      : " + fahrenheit);

        sc.close();
    }
}
