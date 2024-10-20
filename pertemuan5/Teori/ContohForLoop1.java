
import java.util.Scanner;

public class ContohForLoop1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();
        System.out.println(" ");

        System.out.println("For-Loop");
        for (int i = 0; i < nama.length(); i++) {
            System.out.print(nama.charAt(i));
            System.out.print(" ");
        }

        System.out.println("\nWhile-Loop");

        int a = 0;
        while (a < nama.length()) {
            System.out.print(nama.charAt(a));
            System.out.print(" ");
            a++;
        }
        sc.close();
    }
}
