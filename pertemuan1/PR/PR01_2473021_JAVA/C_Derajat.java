package pertemuan1.PR.PR01_2473021_JAVA;

import java.util.Scanner;

public class C_Derajat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Input Celcius : ");
        Integer celcius = sc.nextInt();

        double farenheit = (9.0/5)*celcius+32;
        double reamur = (4.0/5)*celcius;

        System.out.println();
        System.out.println("Konfersi "+celcius+" derajat Celcius : ");
        System.out.println((int)farenheit+" derajat Farenheit");
        System.out.println((int)reamur+" derajat Reamur");

        sc.close();
    }
}
