
import java.util.Scanner;

public class ContohForEach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();
        for (char c : nama.toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
