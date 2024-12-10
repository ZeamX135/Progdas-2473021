"""
Pertemuan 10
[PR]  program manajemen Inventaris

@author 2473021-Febrianus Leona Putra
@version 02 Desember 2024
"""

jumlah = int(input("Jumlah barang inventaris: "))

arr_nama = []
arr_jumlah = []
arr_harga = []

for i in range(jumlah):
    print(f"Barang {i+1}: ")
    nama = input("Nama: ")
    jumlah_barang = int(input("Jumlah: "))
    harga = int(input("Harga: "))
    print("---------------------------------")
    arr_nama.append(nama)
    arr_jumlah.append(jumlah_barang)
    arr_harga.append(harga)

total_inventaris = sum([arr_jumlah[i] * arr_harga[i] for i in range(jumlah)])
print(f"Total nilai inventaris: {total_inventaris:.1f}")
print("---------------------------------")

print("Barang dengan jumlah kurang dari 10:")
for i in range(jumlah):
    if arr_jumlah[i] < 10:
        print(f"{arr_nama[i]} - {arr_jumlah[i]}")
print("---------------------------------")

rata_rata = sum(arr_harga) / jumlah
print(f"Rata-rata harga barang: {rata_rata:.1f}")

print("Barang dengan harga di atas rata-rata:")
for i in range(jumlah):
    if arr_harga[i] > rata_rata:
        print(f"{arr_nama[i]} - {arr_harga[i]}")
