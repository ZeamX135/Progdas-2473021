"""
Pertemuan 09
[PRAKTIKUM]  program untuk menggabungkan dan menjumlahkan nilai dari array a dan array b

@author 2473021-Febrianus Leona Putra
@version 19 Oktober 2024
"""

a = [14, 16, 4, 32, 10, 256, 1]
b = [2, 8, 64, 128, 12, 512]

c = a + b
c.sort()

print("Gabungan Data dari Kedua Array (diurutkan)\t:", c)

jumlah = 0
for i in range(13):
    jumlah += c[i]
    median = c[6]
    mean = jumlah/13.0

print("Jumlah Nilai dari kedua array\t\t\t:", jumlah)
print("Median\t\t\t\t\t\t:", median)
print("Median\t\t\t\t\t\t:", mean)
print("Maximal\t\t\t\t\t\t:", mean)
print("Minimal\t\t\t\t\t\t:", mean)