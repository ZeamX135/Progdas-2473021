public class ContohForLoop {
    public static void main(String[] args) {
        // FOR-LOOP
        System.out.println("FOR-LOOP:");
        // 1. int i = 0; <- fase Inisialisasi variable Counter
        // 2. i < 10; <- fase pengecekan / conditions: True akan loop False akan selesai
        // 3. i++ <- fase increment / decrement
        for (int i = 0; i < 10; i++) {
            // 4. statment yang dijalankan jika While Loop bernilai True
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("WHILE-LOOP:");
        // WHILE-LOOP
        // 1. inisialisasi variable counter
        int a = 0;
        // 2. a < 10; <- fase pengecekan / conditions: True akan loop False akan selesai
        while (a < 10) {
            // 3. statment yang dijalankan jika While Loop bernilai True
            System.out.print(a + " ");
            // 4. a++ <- fase increment / decrement
            a++;
        }

    }
}