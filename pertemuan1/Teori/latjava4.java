
import java.util.Scanner;

public class latjava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        Integer r = sc.nextInt();

        double total = 3.14 * r * r;
        System.out.println();
        System.out.println("Luas Lingkaran : " + total);

        sc.close();
    }
}
