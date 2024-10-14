"""
Pertemuan 04
[PRAKTIKUM] program yang akan menghasilkan tiket parkir

@author 2473021-Febrianus Leona Putra
@version 14 Oktober 2024

"""
from datetime import datetime

print("============== Aplikasi Tiket Parkir ==============")
print("1. Pekerja")
print("2. Pengunjung")
print("===================================================")
masuk = int(input("Pilihan Pekerja/Pengunjung : "))

print("\n===================================================")
print("==================== Kendaraan ====================")
harga = 0
jenis_kendaraan = ""
durasi = 0

if masuk == 1:
    print("1. Truk\n         Rp8.000,-/Flat")
    print("2. Mobil\n         Rp5.000,-/Flat")
    print("3. Motor\n         Rp3.000,-/Flat")
    print("===================================================")
    jenis_kendaraan1 = int(input("Jenis Kendaraan : "))
    
    if jenis_kendaraan1 == 1:
        harga = 8000
        jenis_kendaraan = "TRUK"
    elif jenis_kendaraan1 == 2:
        harga = 5000
        jenis_kendaraan = "MOBIL"
    elif jenis_kendaraan1 == 3:
        harga = 3000
        jenis_kendaraan = "MOTOR"
    else:
        print("System Error")


elif masuk == 2:
    print("1. Bus\n        Rp20.000,-/Jam pertama")
    print("        Rp8.000,-/ Jam berikutnya (< 6 jam)")
    print("        Rp5.000,-/ Jam berikutnya (> 6 jam)")
    print("2. Mobil\n      Rp12.000,-/Jam pertama")
    print("        Rp5.000,-/ Jam berikutnya (< 6 jam)")
    print("        Rp3.000,-/ Jam berikutnya (> 6 jam)")
    print("3. Motor\n      Rp8.000,-/Jam pertama")
    print("        Rp4.000,-/ Jam berikutnya (< 6 jam)")
    print("        Rp2.000,-/ Jam berikutnya (> 6 jam)")
    print("===================================================")
    
    jenis_kendaraan2 = int(input("Jenis Kendaraan : "))
    durasi = int(input("Lama Parkir : "))

    if jenis_kendaraan2 == 1:
        if durasi == 1:
            harga = 20000
        elif durasi > 1 and durasi <= 6:
            harga = 20000 + (8000 * (durasi - 1))
        elif durasi > 6:
            harga = 20000 + (5000 * (durasi - 1))
        else:
            print("System Error")
        jenis_kendaraan = "BUS"

    elif jenis_kendaraan2 == 2:
        if durasi == 1:
            harga = 12000
        elif durasi > 1 and durasi <= 6:
            harga = 12000 + (5000 * (durasi - 1))
        elif durasi > 6:
            harga = 12000 + (3000 * (durasi - 1))
        else:
            print("System Error")
        jenis_kendaraan = "MOBIL"

    elif jenis_kendaraan2 == 3:
        if durasi == 1:
            harga = 8000
        elif durasi > 1 and durasi <= 6:
            harga = 8000 + (4000 * (durasi - 1))
        elif durasi > 6:
            harga = 8000 + (2000 * (durasi - 6))
        else:
            print("System Error")
        jenis_kendaraan = "MOTOR"
    else:
        print("System Error")
else:
    print("System Error")

tanggal_diformat = datetime.now().strftime("%d-%m-%Y, %H:%M:%S")

print("\n==================== Tiket Parkir ====================")
print("                SUMMARECON MAL BEKASI 1               ")
print("Jenis Kendaraan : " + jenis_kendaraan)
print("Keluar          : " + tanggal_diformat)

if masuk == 2:
    print("Lama            : " + str(durasi) + " jam")

print("\nRp: " + str(harga))
