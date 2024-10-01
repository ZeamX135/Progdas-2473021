"""
Pertemuan 03
[PRAKTIKUM] Membuat Program Predikat nilai

@author 2473021-Febrianus Leona Putra
@version 01 Oktober 2024

"""
# Input
nama = (input("Masukkan nama     : "))
nilai = int(input("Masukkan nilai    : "))

# Process
if(80 <= nilai and nilai <=100):
    predikat = "Sangat Baik"
elif(70 <= nilai and nilai <=79):
    predikat = "Baik"
elif(60 <= nilai and nilai <=69):
    predikat = "Cukup"
elif(0 <= nilai and nilai < 60):
    predikat = "Kurang"
else:
    predikat = "Nilai tidak valid"

# Output
print("Nama              :",nama)
print("Predikat          :",predikat)
        