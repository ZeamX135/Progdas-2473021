"""
Pertemuan 04
[PRAKTIKUM] program pembelian tiket museum yang menampilkan daftar museum per provinsinya

@author 2473021-Febrianus Leona Putra
@version 08 Oktober 2024
"""
nama = input("Nama Pengguna: ")
print("======== APP MUSEUM =========")
print("1. Jakarta")
print("2. Jawa Barat")
print("3. Jawa Timur")
print("=============================")
province = int(input("Pilihan Provinsi: "))
print("======= Daftar Museum =======")

hargatiket = 0
if province == 1:
    print("1. Museum Bank Indonesia")
    print("2. Museum Fatahillah")
    print("3. Museum Macan")
    print("=============================")
    museum1 = int(input("Pilihan Museum: "))
    print("\n")
    if museum1 == 1:
        print("Museum Bank Indonesia")
        print("Pelajar\t\t= Gratis")
        print("Umum\t\t= 5000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "pelajar":
            hargatiket = 0 * jumlahtiket
        elif jenistiket.lower() == "umum":
            hargatiket = 5000 * jumlahtiket
    elif museum1 == 2:
        print("Museum Fatahillah")
        print("Pelajar\t\t= 5000")
        print("Umum\t\t= 10000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "pelajar":
            hargatiket = 5000 * jumlahtiket
        elif jenistiket.lower() == "umum":
            hargatiket = 10000 * jumlahtiket
    elif museum1 == 3:
        print("Museum Macan")
        print("Pelajar\t\t= 60000")
        print("Umum\t\t= 70000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "pelajar":
            hargatiket = 60000 * jumlahtiket
        elif jenistiket.lower() == "umum":
            hargatiket = 70000 * jumlahtiket
    else:
        print("System Error")

elif province == 2:
    print("1. Museum Geologi")
    print("2. Taman Patung NuArt")
    print("3. The Bucketlist Indonesia")
    print("=============================")
    museum2 = int(input("Pilihan Museum: "))
    print("\n")
    if museum2 == 1:
        print("Museum Geologi")
        print("Pelajar\t\t= 2000")
        print("Umum\t\t= 3000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "pelajar":
            hargatiket = 2000 * jumlahtiket
        elif jenistiket.lower() == "umum":
            hargatiket = 3000 * jumlahtiket
    elif museum2 == 2:
        print("Taman Patung NuArt")
        print("Pelajar\t\t= 50000")
        print("Umum\t\t= 25000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "pelajar":
            hargatiket = 50000 * jumlahtiket
        elif jenistiket.lower() == "umum":
            hargatiket = 25000 * jumlahtiket
    elif museum2 == 3:
        print("The Bucketlist Indonesia")
        print("Umum\t\t= 30000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "umum":
            hargatiket = 30000 * jumlahtiket
    else:
        print("System Error")

elif province == 3:
    print("1. House of Sampoerna")
    print("2. Museum Angkut")
    print("3. Museum dan Perpustakaan Bung Karno")
    print("=============================")
    museum3 = int(input("Pilihan Museum: "))
    print("\n")
    if museum3 == 1:
        print("House of Sampoerna")
        print("Umum\t\t= Gratis")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        hargatiket = 0 * jumlahtiket
    elif museum3 == 2:
        print("Museum Angkut")
        print("Dewasa\t\t= 100000")
        print("Anak\t\t= Gratis")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        if jenistiket.lower() == "dewasa":
            hargatiket = 100000 * jumlahtiket
        elif jenistiket.lower() == "anak":
            hargatiket = 0 * jumlahtiket
    elif museum3 == 3:
        print("Museum dan Perpustakaan Bung Karno")
        print("Umum\t\t= 3000")
        print("=============================")
        jenistiket = input("Jenis tiket yang ingin dibeli: ")
        jumlahtiket = int(input("Jumlah tiket yang ingin dibeli: "))
        hargatiket = 3000 * jumlahtiket
    else:
        print("System Error")

print("=============================")
print(f"\n{nama}, pembelian kamu sebesar Rp {hargatiket} telah berhasil!")
print("Tampilkan bukti pembayaran ke loket untuk menukarkan tiket")
