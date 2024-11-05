package pertemuan6.Teori;

import java.util.Scanner;

public class referensiTubes1 {

    public static void main(String[] args) {
        // Declare variables
        String[] menu = {"Coffee", "Tea", "Sandwich", "Pastry", "Cake"};
        int[] price = {1, 1, 2, 5, 5};
        int[] quantity = {0, 0, 0, 0, 0};
        int choice, qty, total = 0;
        char ans;

        // Display menu
        System.out.println("------------------------");
        System.out.println("      CAFE MENU");
        System.out.println("------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%2d. %-10s $%d\n", i + 1, menu[i], price[i]);
        }
        System.out.println("-----------------------");

        // Ordering process
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter your choice (1-5): ");
            choice = input.nextInt();
            if (choice > 0 && choice < 6) {
                System.out.print("Enter quantity: ");
                qty = input.nextInt();
                quantity[choice - 1] += qty;
                total += price[choice - 1] * qty;
            }
            System.out.print("Add more items? (Y/N): ");
            ans = input.next().charAt(0);
        } while (ans == 'Y' || ans == 'y');
        input.close();

        // Printing the receipt
        System.out.println("\n------------------------");
        System.out.println("         RECEIPT");
        System.out.println("------------------------");
        for (int i = 0; i < 5; i++) {
            if (quantity[i] > 0) {
                System.out.printf("%-10s x%2d = $%5d\n", menu[i], quantity[i], price[i] * quantity[i]);
            }
        }
        System.out.println("------------------------");
        System.out.println("Total: $" + total);
        System.out.println("------------------------");
    }
}
