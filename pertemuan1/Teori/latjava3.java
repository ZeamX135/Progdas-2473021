
import java.util.Scanner;

public class latjava3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        Integer pertama = sc.nextInt();
        System.out.print("Masukkan Angka Kedua: ");
        Integer kedua = sc.nextInt();
        System.out.print("Masukkan Angka Ketiga: ");
        Integer ketiga = sc.nextInt();

        Integer total = pertama*kedua*ketiga;
        System.out.println();
        System.out.println("Hasilnya : " + total);

    }
}
