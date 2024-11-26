"""
Pertemuan 10
[PRAKTIKUM]  program yang meminta input N data untuk Nama dan IPK mahasiswa untuk disimpan ke dalam suatu list.

@author 2473021-Febrianus Leona Putra
@version 26 November 2024
"""
n = int(input("N: "))

arr1 = []  
arr2 = []  
for i in range(n):  
    nama = (input("Nama : "))  
    ipk = float(input("IPK : "))  
    arr1.append(nama)
    arr2.append(ipk)

print("-------------------------------")

ipkTertinggi = max(arr2)
indeksTertinggi = arr2.index(ipkTertinggi)
namaTertinggi = arr1[indeksTertinggi]

dengan_pujian = []
sangat_memuaskan = []
memuaskan = []

for i in range(n):
    if arr2[i] > 3.5:
        dengan_pujian.append(arr1[i])
    elif arr2[i] > 3.0:
        sangat_memuaskan.append(arr1[i])
    elif arr2[i] > 2.75:
        memuaskan.append(arr1[i])

print(f"IPK tertinggi: {namaTertinggi}: {ipkTertinggi}")
print("Predikat dengan Pujian: ", end="")
for i, nama in enumerate(dengan_pujian):
    if i > 0:
        print(", ", end="")
    print(nama, end="")
print()  
print("Predikat Sangat Memuaskan: ", end="")
for i, nama in enumerate(sangat_memuaskan):
    if i > 0:
        print(", ", end="")
    print(nama, end="")
print()  
print("Predikat Memuaskan: ", end="")
for i, nama in enumerate(memuaskan):
    if i > 0:
        print(", ", end="")
    print(nama, end="")
print()