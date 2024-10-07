"""
Pertemuan 03
[PR] Membuat program yang akan memberikan struk dari pesanan yang diinput oleh user dari berbagai jenis menu restaurant yang disediakan.

@author 2473021-Febrianus Leona Putra
@version 07 Oktober 2024

"""
nama = input("Input nama: ")
print("======================")
print("MENU:")
print("1. Nasi Java    - Rp 25000")
print("2. Mie Python   - Rp 15000")
print("3. Ayam PHP     - Rp 20000")
print("4. Sate Coding  - Rp 30000")
print("5. Es Teh HTML  - Rp 7500")

print("WELCOME TO PROGDAS RESTAURANT!")

pilihan = int(input("pilihan Anda: "))

if pilihan == 1:
    pesanan_utama = "Nasi Java"
    harga_pesanan = 25000
elif pilihan == 2:
    pesanan_utama = "Mie Python"
    harga_pesanan = 15000
elif pilihan == 3:
    pesanan_utama = "Ayam PHP"
    harga_pesanan = 20000
elif pilihan == 4:
    pesanan_utama = "Sate Coding"
    harga_pesanan = 30000
elif pilihan == 5:
    pesanan_utama = "Es Teh HTML"
    harga_pesanan = 7500
else:
    pesanan_utama = "Menu Tidak Valid"
    harga_pesanan = 0

total_harga = harga_pesanan

ada_tambahan = input("Apakah ada tambahan pesanan? (Y/N): ").strip().lower()

harga_tambahan = 0
pesanan_tambahan = ""
if ada_tambahan == 'y':
    tambahan = int(input("Tambahan Pesanan: "))
    

    if tambahan == 1:
        pesanan_tambahan = "Nasi Java"
        harga_tambahan = 25000
    elif tambahan == 2:
        pesanan_tambahan = "Mie Python"
        harga_tambahan = 15000
    elif tambahan == 3:
        pesanan_tambahan = "Ayam PHP"
        harga_tambahan = 20000
    elif tambahan == 4:
        pesanan_tambahan = "Sate Coding"
        harga_tambahan = 30000
    elif tambahan == 5:
        pesanan_tambahan = "Es Teh HTML"
        harga_tambahan = 7500
    else:
        pesanan_tambahan = "Menu Tidak Valid"
        harga_tambahan = 0

    total_harga += harga_tambahan

print("===========================")

kode_voucher = input("Masukkan kode voucher: ").strip()
print("==============================================")

voucher = "PEMROGRAMANDASAR"
potongan = 2500
potongan_awal = 0

if kode_voucher == voucher:
    print(f"Selamat Anda mendapatkan Potongan sebesar {potongan}!")
    potongan_awal = potongan
    total_harga -= potongan_awal
else:
    print("Voucher yang anda input tidak berlaku")

print("\n----------------- STRUK ----------------")
print(f"Nama            : {nama}")
print(f"Jenis Pesanan   : {pesanan_utama}", end="")
if pesanan_tambahan:
    print(f" dan {pesanan_tambahan}")
else:
    print()

print(f"Total Pesanan   : Rp {harga_pesanan + harga_tambahan}")
print(f"Potongan        : Rp {potongan_awal}")
print(f"Total Harga     : Rp {total_harga}")
print("------------------------------------")
