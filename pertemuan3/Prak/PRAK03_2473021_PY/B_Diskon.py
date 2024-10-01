"""
Pertemuan 03
[PRAKTIKUM] Membuat Penghitungan diskon berdasarkan kategori barang

@author 2473021-Febrianus Leona Putra
@version 01 Oktober 2024

"""
# Input
print("==============================")
print("     Program Diskon Barang    ")
print("==============================")
harga = float(input("Masukkan harga barang (Rp) : "))
kategori = (input("Masukkan kategori barang (elektronik, pakaian, makanan) : "))

# Process
if("elektronik"==(kategori)):
    diskon = "Anda mendapatkan diskon 10% untuk barang "
elif("pakaian"==(kategori)) :
    diskon = "Anda mendapatkan diskon 20% untuk barang "
elif("makanan"==(kategori)) :
    diskon = "Anda mendapatkan diskon 5% untuk barang "
else:
    diskon = "Anda tidak mendapat diskon untuk barang",kategori

if("elektronik"==(kategori)):
    hasil = harga-(harga*10.0/100)
elif("pakaian"==(kategori)):
    hasil = harga-(harga*20.0/100)
elif("makanan"==(kategori)):
    hasil = harga-(harga*5.0/100)
else:
    hasil = harga

# Output
print(diskon+kategori,".")
print("==============================")
print("Harga asli barang   : Rp",harga)
print("Harga setelah diskon: Rp",hasil)
print("==============================")
print("Terima kasih telah berbelanja!")


