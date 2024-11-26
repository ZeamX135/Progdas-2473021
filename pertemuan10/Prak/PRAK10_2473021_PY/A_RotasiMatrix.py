"""
Pertemuan 10
[PRAKTIKUM]  program yang menggunakan array 2 dimensi untuk melakukan rotasi matriks berukuran N x N searah dan berlawanan arah jarum jam.

@author 2473021-Febrianus Leona Putra
@version 26 November 2024
"""
ukuran = int(input("Masukkan ukuran matriks (N x N): "))
matriks = []

print("Masukkan elemen-elemen matriks:")
for i in range(ukuran):
    baris = list(map(int, input().split()))
    matriks.append(baris)

temp = [[0] * ukuran for _ in range(ukuran)]
for i in range(ukuran):
    for j in range(ukuran):
        temp[j][ukuran - 1 - i] = matriks[i][j]

print("Matriks setelah rotasi 90 derajat (searah jarum jam):")
for baris in temp:
    for elemen in baris:
        print(elemen, end=" ")
    print()

temp2 = [[0] * ukuran for _ in range(ukuran)]
for i in range(ukuran):
    for j in range(ukuran):
        temp2[ukuran - 1 - j][i] = matriks[i][j]

print("Matriks setelah rotasi 90 derajat (berlawanan arah jarum jam):")
for baris in temp2:
    for elemen in baris:
        print(elemen, end=" ")
    print()
