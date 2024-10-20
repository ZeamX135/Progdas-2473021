"""
Pertemuan 05
[PR] program bentuk pola silang dengan bintang (*) yang panjang garisnya menyesuaikan
dengan inputan user.

@author 2473021-Febrianus Leona Putra
@version 20 Oktober 2024

"""
print("==== PROGRAM SILANG ====")
tinggi = int(input("Input Tinggi: "))
print("========= HASIL ========")

for i in range(1, tinggi + 1):
    for j in range(1, tinggi +1):
        if(j == i or j == tinggi - i + 1):
            print("*",end="")
        else:
            print(" ",end="")
    print()