"""
Pertemuan 10
[PR]  program yang menggunakan ArrayList untuk melakukan berbagai operasi pada daftar bilangan bulat.

@author 2473021-Febrianus Leona Putra
@version 02 Desember 2024

"""
elemen = []
jumlah = int(input("Masukkan jumlah elemen (N): "))

print("Masukkan elemen: ")
for i in range(jumlah):
    elemen.append(int(input()))

operasi = 0
while operasi != 8:
    print("\nArraylist saat ini:", elemen)
    print("Pilih operasi:")
    print("1. Tambahkan elemen baru")
    print("2. Hapus elemen tertentu")
    print("3. Ganti elemen pada indeks tertentu")
    print("4. Cari elemen tertentu")
    print("5. Urutkan elemen")
    print("6. Tampilkan elemen dalam urutan terbalik")
    print("7. Hitung jumlah elemen")
    print("8. Keluar")
    operasi = int(input("Masukkan pilihan (1-8): "))

    if operasi == 1:
        elemen_new = int(input("Masukkan elemen baru: "))
        elemen.append(elemen_new)
        print("Elemen berhasil ditambahkan.")
    elif operasi == 2:
        elemen_delete = int(input("Masukkan elemen yang ingin dihapus: "))
        if elemen_delete in elemen:
            elemen.remove(elemen_delete)
            print("Elemen berhasil dihapus.")
        else:
            print("Elemen tidak ditemukan.")
    elif operasi == 3:
        indeks = int(input("Masukkan indeks yang ingin diganti: "))
        if 0 <= indeks < len(elemen):
            elemen_baru = int(input("Masukkan elemen baru: "))
            elemen[indeks] = elemen_baru
            print(f"Elemen pada indeks {indeks} berhasil diganti.")
        else:
            print("Indeks tidak ditemukan.")
    elif operasi == 4:
        elemen_find = int(input("Masukkan elemen yang ingin dicari: "))
        if elemen_find in elemen:
            for i, e in enumerate(elemen):
                if e == elemen_find:
                    print(f"Elemen {elemen_find} ditemukan pada indeks ke-{i}")
        else:
            print("Elemen tidak ditemukan.")
    elif operasi == 5:
        elemen.sort()
        print("Arraylist berhasil diurutkan.")
    elif operasi == 6:
        elemen.reverse()
        print("Elemen dalam urutan terbalik:", elemen)
    elif operasi == 7:
        print("Jumlah elemen dalam arraylist:", len(elemen))
    elif operasi == 8:
        print("Program selesai.")
    else:
        print("Input tidak valid, pilih angka (1-8).")