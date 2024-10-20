"""
Pertemuan 05
[PR]  program bentuk pola segitiga sama kaki dengan bintang (*) yang tinggi segitiganya
menyesuaikan dengan inputan user.

@author 2473021-Febrianus Leona Putra
@version 20 Oktober 2024

"""
print("==== SEGITIGA SAMA SISI ====")
tinggi = int(input("Input Tinggi: "))
print("========== Hasil ==========")

for i in range(1, tinggi + 1):
    for j in range(i, tinggi):
        print(" ", end="")
    for j in range(1, (2 * i)):
        print("*", end="")
    print()