
import java.util.Scanner;

public class latjava2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        Integer pertama = sc.nextInt();
        System.out.print("Masukkan Angka Kedua: ");
        Integer kedua = sc.nextInt();

        System.out.println("Angka Pertama : " + pertama + ", Angka Kedua : "+ kedua );

        sc.close();
    }
}
