"""
Pertemuan 02
[PRAKTIKUM] Membuat Program True False

@author 2473021-Febrianus Leona Putra
@version 24 September 2024

"""
# Input
pertama = float(input("Masukkan Angka Pertama : "))
kedua = int(input("Masukkan Angka Kedua : "))
ketiga = int(input("Masukkan Angka Ketiga : "))

# Process
kondisi1 = pertama > kedua and pertama > ketiga
kondisi2 = pertama == ketiga
kondisi3 = ketiga > pertama and ketiga > kedua
kondisi4 = ketiga < kedua
kondisi5 = pertama != kedua
kondisi6 = pertama >= ketiga
kondisi7 = pertama > ketiga

# Output
print("-------------------------------------")
print("==========Program True False=========")
print("-------------------------------------")
print("Angka pertama > dari kedua dan Ketiga")
print(kondisi1)
print("-------------------------------------")
print("Angka Pertama = Angka ketiga")
print(kondisi2)
print("-------------------------------------")
print("Angka Ketiga > dari Pertama dan Kedua")
print(kondisi3)
print("-------------------------------------")
print("Angka Ketiga < dari Angka Kedua")
print(kondisi4)
print("-------------------------------------")
print("Angka Pertama != angka kedua")
print(kondisi5)
print("-------------------------------------")
print("Angka Pertama >= angka ketiga")
print(kondisi6)
print("-------------------------------------")
print("Angka Pertama > angka ketiga")
print(kondisi7)
print("-------------------------------------")