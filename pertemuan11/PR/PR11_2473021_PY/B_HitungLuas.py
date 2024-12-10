"""
Pertemuan 11
[PR] program untuk menghitung luas dan keliling

@author 2473021-Febrianus Leona Putra
@version 06 Desember 2024
"""
def luas_persegi():
    sisi = int(input("Input Sisi: "))
    luas = sisi * sisi
    keliling = 4 * sisi
    print(f"Hasil Luas: {luas}")
    print(f"Hasil Keliling: {keliling}")

def luas_pp():
    panjang = int(input("Input Panjang: "))
    lebar = int(input("Input Lebar: "))
    luas = panjang * lebar
    keliling = 2 * (panjang + lebar)
    print(f"Hasil Luas: {luas}")
    print(f"Hasil Keliling: {keliling}")

def luas_lingkaran():
    jari_jari = int(input("Input Jari-jari: "))
    luas = 3.14 * (jari_jari ** 2)
    keliling = 2 * 3.14 * jari_jari
    print(f"Hasil Luas: {luas}")
    print(f"Hasil Keliling: {keliling}")

def luas_jajargenjang():
    alas = int(input("Input Alas: "))
    tinggi = int(input("Input Tinggi: "))
    sisi_miring = int(input("Input Sisi Miring: "))
    luas = alas * tinggi
    keliling = 2 * (alas + sisi_miring)
    print(f"Hasil Luas: {luas}")
    print(f"Hasil Keliling: {keliling}")

while True:
    print("\nPilih Luas")
    print("1. Luas Persegi")
    print("2. Luas Persegi Panjang")
    print("3. Luas Lingkaran")
    print("4. Luas Jajargenjang")

    pilih = input("Pilihan: ")

    if pilih.isdigit():
        pilih = int(pilih)
        if 1 <= pilih <= 4:
            break
        else:
            print("Pilihan tidak valid")
    else:
        print("Input tidak valid")

if pilih == 1:
    luas_persegi()
elif pilih == 2:
    luas_pp()
elif pilih == 3:
    luas_lingkaran()
elif pilih == 4:
    luas_jajargenjang()
