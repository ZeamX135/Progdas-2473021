"""
Pertemuan 02
[PRAKTIKUM] Membuat Program Aritmatika

@author 2473021-Febrianus Leona Putra
@version 24 September 2024

"""
# Input
pertama = float(input("Masukkan Angka Pertama : "))
kedua = int(input("Masukkan Angka Kedua : "))

#Process
penjumlahan = pertama + kedua
pengurangan = pertama - kedua
perkalian = pertama * kedua
pembagian = pertama / kedua
modulo = pertama % kedua

# Output
print("==============================")
print("------Program Perhitungan-----")
print("==============================")
print("Hasil Penjumlahan (+) dari :")
print(pertama," + ",kedua," = ",penjumlahan)
print("------------------------------")
print("Hasil Pengurangan (-) dari :")
print(pertama," - ",kedua," = ",pengurangan)
print("------------------------------")
print("Hasil Perkalian (*) dari :")
print(pertama," * ",kedua," = ",perkalian)
print("------------------------------")
print("Hasil Pembagian (/) dari :")
print(pertama," / ",kedua," = ",pembagian)
print("------------------------------")
print("Hasil Modulo (%) dari :")
print(pertama," % ",kedua," = ",modulo)
print("==============================")

