"""
Pertemuan 02
[PR] Membuat Program yang dapat menghitung luas berbagai bangun datar

@author 2473021-Febrianus Leona Putra
@version 29 September 2024
"""
print(".:=Program Penghitung bangun Datar=:.")
print("-------------------------------------")

# Persegi Panjang
print("Persegi panjang :")
panjangPersegiPanjang = float(input("Masukkan panjang: "))
lebarPersegiPanjang = float(input("Masukkan lebar: "))

luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang

print("Luas persegi panjang:",luasPersegiPanjang)
print("-------------------------------------")

# Persegi
print("Persegi :")
sisiPersegi = float(input("Masukkan sisi: "))

luasPersegi = sisiPersegi * sisiPersegi

print("Luas persegi:",luasPersegi)
print("-------------------------------------")

# Lingkaran
print("Lingkaran :")
jariJariLingkaran = float(input("Masukkan jari-jari: "))

luasLingkaran = 3.14*jariJariLingkaran*jariJariLingkaran

print("Luas lingkaran:",luasLingkaran)
print("-------------------------------------")

# Segitiga
print("Segitiga :")
alasSegitiga = float(input("Masukkan alas: "))
tinggiSegitiga = float(input("Masukkan tinggi: "))

luasSegitiga = 0.5*alasSegitiga*tinggiSegitiga

print("Luas segitiga:",luasSegitiga)
print("-------------------------------------")