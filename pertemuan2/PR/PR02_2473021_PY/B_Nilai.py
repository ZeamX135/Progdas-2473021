"""
Pertemuan 02
[PR] Membuat Program Perhitungan nilai akhir mahasiswa

@author 2473021-Febrianus Leona Putra
@version 29 September 2024
"""
import math

# Input
nama = (input("Nama Mahasiswa : "))
uts = int(input("Nilai UTS : "))
uas = int(input("Nilai UAS : "))
kat = int(input("Nilai KAT : "))
bobotUTS = float(input("Bobot<%> nilai UTS : "))
bobotUAS = float(input("Bobot<%> nilai UAS : "))
bobotKAT = float(input("Bobot<%> nilai KAT : "))

# Process
hasil = (uts*bobotUTS/100) + (uas*bobotUAS/100) + (kat*bobotKAT/100)

# Output
print()
print("=================================")
print("Perhitungan nilai mahasiswa :")
print("=================================")
print("Nama Mahasiswa :",nama)
print("Nilai UTS :",uts)
print("Nilai UAS :",uas)
print("Nilai KAT :",kat)
print("Bobot<%> nilai UTS :",bobotUTS)
print("Bobot<%> nilai UAS :",bobotUAS)
print("Bobot<%> nilai KAT :",bobotKAT)
print("==========================================")
print("Please wait...calculating...")
print("==========================================")
print("Nilai akhir",nama," :",hasil)
print("pembulatan : ", math.ceil(hasil))