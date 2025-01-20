def segitiga_pascal(n):
    """Fungsi untuk membangkitkan segitiga Pascal hingga baris ke-n."""
    pascal = [[1]]
    for i in range(1, n):
        baris = [1]
        for j in range(1, i):
            baris.append(pascal[i-1][j-1] + pascal[i-1][j])
        baris.append(1)
        pascal.append(baris)
    return pascal

def tampilkan_pascal(pascal, format_tampilan):
    """Fungsi untuk menampilkan segitiga Pascal dalam berbagai format."""
    tinggi = len(pascal)
    for i, baris in enumerate(pascal):
        spasi = " " * (tinggi - i - 1)  # Tambahkan spasi di awal setiap baris
        if format_tampilan == 1:  # Standar
            print(spasi + " ".join(map(str, baris)))
        elif format_tampilan == 2:  # Angka dengan batas (angka > 5 diganti *)
            print(spasi + " ".join(str(x) if x <= 5 else "*" for x in baris))
        elif format_tampilan == 3:  # Bintang (semua angka diganti dengan *)
            print(spasi + " ".join("*" for _ in baris))

def main():
    print("====== Segitiga Pascal ======")
    try:
        tinggi = int(input("Masukkan tinggi segitiga Pascal: "))
        if tinggi <= 0:
            print("Tinggi harus lebih besar dari 0!")
            return

        print("\nPilih format segitiga Pascal:")
        print("1. Standar")
        print("2. Angka (lebih dari 5 diganti *)")
        print("3. Bintang (semua angka diganti dengan *)")
        pilihan = int(input("Masukkan Pilihan: "))
        if pilihan not in [1, 2, 3]:
            print("Pilihan tidak valid! Harap pilih antara 1, 2, atau 3.")
            return

        print(f"\nSegitiga Pascal hingga {tinggi} baris:")
        pascal = segitiga_pascal(tinggi)
        tampilkan_pascal(pascal, pilihan)

    except ValueError:
        print("Input tidak valid! Harap masukkan angka.")

if __name__ == "__main__":
    main()
