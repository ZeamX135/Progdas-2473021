"""
Pertemuan 05
[PR] program yang dapat menampilkan persegi yang dibuat dari bintang(*) disetiap sisi, dan angka random antara 0-9
untuk isi dari persegi, panjang sisi dibuat sesuai dengan jumlah inputan user.

@author 2473021-Febrianus Leona Putra
@version 20 Oktober 2024

"""
import random

print("==== PROGRAM PERSEGI ====")
sisi = int(input("Input Sisi : "))
print("========= HASIL =========")

for i in range(1, sisi + 1):
    for j in range(1, sisi + 1):
        if (i == 1 or j == 1 or i == sisi or j == sisi):
            print(" * ", end="")
        else:
            isi = random.randint(0, 9)
            print("", isi, "", end="")
    print()