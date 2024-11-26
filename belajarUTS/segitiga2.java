package belajarUTS;

public class segitiga2 {

    public static void main(String[] args) {
        int n = 5; // jumlah baris

        for (int i = 1; i <= n; i++) {
            // Cetak bintang di setiap baris sebanyak nomor baris
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
