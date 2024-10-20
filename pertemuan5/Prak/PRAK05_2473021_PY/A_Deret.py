"""
Pertemuan 05
[PRAKTIKUM] aplikasi yang menampilkan deret bilangan, dimana jarak antar bilangan akan selalu
ditambahkan dan panjang deret bilangan berdasarkan angka yang dimasukkan user

@author 2473021-Febrianus Leona Putra
@version 15 Oktober 2024

"""
print("PROGRAM DERET ANGKA")
print("==========================")
batas = int(input("Masukkan Panjang Deret :"))
print("Hasil Deret :")

hasil = 0
for i in range(batas):
    hasil = hasil + i
    print(hasil, end=" ")