"""
Pertemuan 05
[PRAKTIKUM] program yang dapat menampilkan segitiga siku-siku yang terbuat dari bintang (*)

@author 2473021-Febrianus Leona Putra
@version 15 Oktober 2024

"""
tinggi = int(input("Input Tinggi : "))
print("================================")
print("Segitiga Siku-Siku Dengan Tinggi" , tinggi)

for i in range(tinggi):
    for j in range(i+1):
        print("*",end="")
    print("")
        