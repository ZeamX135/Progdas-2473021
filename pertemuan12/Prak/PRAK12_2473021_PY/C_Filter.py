"""
Pertemuan 12
[PRAKTIKUM] sistem yang dapat menerima inputan nomor telepon dari pengguna. Sistem harus dapat 
mencari nomor telepon berdasarkan potongan nomor yang dimasukkan.

@author 2473021-Febrianus Leona Putra
@version 10 Desember 2024
"""
arr_nomor = []
limit = int(input("Banyaknya Nomor: "))

for i in range(limit):
    nomor = input(f"Nomor {i+1}: ")
    arr_nomor.append(nomor)

cari = int(input("Potongan nomor yang dicari: "))
hasil = [str(nomor) for nomor in arr_nomor if str(cari) in str(nomor)]

if hasil:
    print("\nHasil:")
    for nomor in hasil:
        print(nomor)
else:
    print("Tidak ada nomor yang sesuai")