"""
Pertemuan 11
[PRAKTIKUM] program yang akan menerima masukan n-buah bilangan bulat lalu akan menampilkan 
nilai terbesar, nilai terkecil dan nilai mean dari n-buah bilangan tersebut.

@author 2473021-Febrianus Leona Putra
@version 03 Desember 2024
"""
import statistics

bilangan = []
jumlah = int(input("Jumlah bilangan: "))

for i in range(jumlah):
    bilangan.append(int(input()))

def rumus():
    besar = max(bilangan)
    kecil = min(bilangan)
    mean = statistics.mean(bilangan)
    return besar, kecil, mean

besar, kecil, mean = rumus()

print("Terbesar : ", besar)
print("Terkecil : ", kecil)
print("Mean : ", mean)