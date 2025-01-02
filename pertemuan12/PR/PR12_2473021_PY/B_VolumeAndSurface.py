"""
Pertemuan 12
[PR] Program yang memungkinkan pengguna untuk memilih 3 jenis bangun ruang.

@author 2473021-Febrianus Leona Putra
@version 15 Desember 2024

"""
import math

print("Pilihan:")
print("1. Kubus")
print("2. Prisma Segitiga")
print("3. Bola")

while True:
    pilih = input("\nPilih: ")

    if pilih.isdigit():
        pilih = int(pilih)
        if 1 <= pilih <= 3:
            break
        else:
            print("Pilihan tidak valid, masukkan angka 1-3.")
    else:
        print("Input tidak valid, masukkan angka.")

if pilih == 1:
    luas = float(input("Masukkan luas area: "))
    sisi = math.sqrt(luas / 6)  
    volume = sisi ** 3          
    print(f"\nVolume: {volume:.2f}")
    print(f"Sisi: {sisi:.2f}")

elif pilih == 2:
    luas = float(input("Masukkan luas area: "))
    sisi = float(input("Masukkan panjang sisi segitiga: "))
    luas_alas = 0.5 * sisi ** 2  
    keliling_alas = 3 * sisi     
    tinggi = (luas - 2 * luas_alas) / keliling_alas  
    volume = luas_alas * tinggi  
    print(f"\nVolume: {volume:.2f}")
    print(f"Tinggi Prisma: {tinggi:.2f}")

elif pilih == 3:
    luas = float(input("Masukkan luas area: "))
    jari_jari = math.sqrt(luas / (4 * math.pi))  
    volume = (4 / 3) * math.pi * (jari_jari ** 3)  
    print(f"\nVolume: {volume:.2f}")
    print(f"Jari-jari: {jari_jari:.2f}")
