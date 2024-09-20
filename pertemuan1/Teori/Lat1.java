import java.util.Scanner;

/**
 * Pertemuan 01
 * Contoh Program 1:Hello World
 * 
 * @author 2473021-Febrianus Leona Putra
 * @version 17 September 2024
 */

public class Lat1{
    public static void main(String[] args){
        // System.out.println("Hello World, Febrianus Leona Putra.");
        // System.out.println("Welcome\'s, 2473021.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = sc.next();
        System.out.print("Masukkan Umur Anda: ");
        Integer umur = sc.nextInt();

        System.out.println("Nama Anda adalah " + nama + ", umur anda: "+ umur );

        sc.close();
    }
}