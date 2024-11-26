"""  
Pertemuan 10  
[PRAKTIKUM] program yang meminta pengguna untuk memasukkan jumlah elemen yang ingin dimasukkan ke dalam daftar.  

@author 2473021-Febrianus Leona Putra  
@version 26 November 2024  
"""  
jumlah = int(input("Masukkan jumlah elemen: "))  

arr1 = []  
print("Masukkan elemen:")  
for i in range(jumlah):  
    elemen = int(input("Elemen " + str(i + 1) + ": "))  
    arr1.append(elemen)  

genap = [angka for angka in arr1 if angka % 2 == 0] 
ganjil = [angka for angka in arr1 if angka % 2 != 0]  
gabung = ganjil+genap
gabung.sort()

print("Jumlah bilangan genap:", len(genap))  
print("Jumlah bilangan ganjil:", len(ganjil))
print("Jumlah bilangan genap:", genap)
print("Jumlah bilangan ganjil:", ganjil)
print()
print("Penggabungan list Ganjil Genap yang telah diurutkan: ",gabung)

