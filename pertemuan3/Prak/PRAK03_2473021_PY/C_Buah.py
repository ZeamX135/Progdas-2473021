"""
Pertemuan 03
[PRAKTIKUM] Membuat Penghitungan Harga buah

@author 2473021-Febrianus Leona Putra
@version 01 Oktober 2024

"""

# Input
print("Buah ke-1")
buah1 = (input("Buah (Nanas/Anggur/Manggis) : "))
jumlah1 = int(input(f"Jumlah {buah1} (kg)           : "))

print("----------------------------------------------")
print("Buah ke-2")
buah2 = (input("Buah (Nanas/Anggur/Manggis) : "))
jumlah2 = int(input(f"Jumlah {buah2} (kg)         : "))

# Process
perkilo1nanas = 0
perkilo2nanas = 0
perkilo1anggur = 0
perkilo2anggur = 0
jumlahmanggis = 0
perkilo1manggis = 0
perkilo2manggis = 0

if("Nanas"==(buah1)):
    jumlahnanas = jumlah1
    perkilo1nanas = jumlah1*50000
elif("Nanas"==(buah2)):
    jumlahnanas = jumlah2
    perkilo2nanas = jumlah2*50000
else:
    jumlahnanas = 0
    perkilo1nanas = 0
    perkilo2nanas = 0

if("Anggur"==(buah1)):
    jumlahanggur = jumlah1
    perkilo1anggur = jumlah1*15000
elif("Anggur"==(buah2)):
    jumlahanggur = jumlah2
    perkilo2anggur = jumlah2*15000
else:
    jumlahanggur = 0
    perkilo1anggur = 0
    perkilo2anggur = 0

if("Manggis"==(buah1)):
    jumlahmanggis = jumlah1
    perkilo1manggis = jumlah1*25000

elif("Manggis"==(buah2)):
    jumlahmanggis = jumlah2
    perkilo2manggis = jumlah2*25000
else:
    jumlahmanggis = 0
    perkilo1manggis = 0
    perkilo2manggis = 0

totaljumlah = jumlah1+jumlah2
 
totalharga = perkilo1nanas+perkilo2nanas+perkilo1anggur+perkilo2anggur+perkilo1manggis+perkilo2manggis

# Output
print("==============================================")
print("Jumlah Buah Nanas        :" ,jumlahnanas)
print("Jumlah Buah Anggur       :",jumlahanggur)
print("Jumlah Buah Manggis      :",jumlahmanggis)
print("==============================================")
print("Total Jumlah Buah adalah",totaljumlah,"kg")
print("Total Harga Buah Rp",totalharga)



