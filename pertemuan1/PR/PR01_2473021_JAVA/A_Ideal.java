package pertemuan1.PR.PR01_2473021_JAVA;

import java.util.Scanner;

public class A_Ideal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hitung berat badan ideal");

        System.out.print("Input Tinggi Badan : ");
        double tb = sc.nextDouble();
        
        double ideal = (tb-100)-((tb-100)*15/100);
        System.out.println("Berat Badan Ideal : " + ideal);

        sc.close();
    }
}
