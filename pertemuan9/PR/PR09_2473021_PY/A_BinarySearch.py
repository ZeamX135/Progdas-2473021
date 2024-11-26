"""
Pertemuan 09
[PR]  program yang meminta jumlah bilangan dalam bentuk array dan user dapat menginput bilangan untuk setiap indeksnya, 
setelah itu user dapat mencari letak indeks angka yang diinginkan

@author 2473021-Febrianus Leona Putra
@version 24 November 2024

"""
n = int(input("Jumlah bilangan: "))
array = []

for i in range(n):
    angka = int(input(f"Indeks ke-{i}: "))
    array.append(angka)

target = int(input("Angka yang dicari: "))

left = 0
right = len(array) - 1
result = -1

while left <= right:
    middle = (left + right) // 2

    if array[middle] == target:
        result = middle
        break
    elif array[middle] < target:
        left = middle + 1
    else:
        right = middle - 1

if result == -1:
    print("Data tidak ditemukan.")
else:
    print(f"Data ditemukan pada indeks: {result}")
