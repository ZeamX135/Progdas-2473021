"""
Pertemuan 09
[PRAKTIKUM]  program sederhana yang meminta pengguna memasukkan dua array berukuran N dengan elemen bilangan bulat

@author 2473021-Febrianus Leona Putra
@version 19 Oktober 2024
"""
arr_count = int(input("Masukkan Ukuran Array (N): "))

arr1 = []
print("Masukkan Elemen Array Pertama")
for i in range(arr_count):
    elemen1 = int(input("Elemen Ke-" + str(i + 1) + ": "))
    arr1.append(elemen1)

arr2 = []
print("Masukkan Elemen Array Kedua")
for i in range(arr_count):
    elemen2 = int(input("Elemen Ke-" + str(i + 1) + ": "))
    arr2.append(elemen2)

hasil = []
total = 0
for i in range(arr_count):
    subtotal = arr1[i] + arr2[i]
    hasil.append(subtotal)
    print("Hasil Penjumlahan Ke-" + str(i + 1) + ": " + str(subtotal))
    total += subtotal

print("Total Penjumlahan: " + str(total))