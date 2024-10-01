package pertemuan3.Teori;

import java.util.Scanner;

public class Lat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        int a = sc.nextInt();

        if(a>=0){
            System.out.println(a+" positif");
        }else if(a == 0){
            System.out.println(a+" bilangan nol");
        }else {
            System.out.println(a+" negatif");
        }

        // single statement
        String hasil = (a >= 0) ? a + "positif":"negatif";
        System.out.println(hasil);

        sc.close();
    }
}
