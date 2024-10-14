"""
Pertemuan 04
[PRAKTIKUM] program yang dapat menyarankan destinasi wisata berdasarkan budget yang dimiliki oleh pengguna

@author 2473021-Febrianus Leona Putra
@version 14 Oktober 2024

"""
print("================== Holiday Trip Planner ==================")
budget = float(input("Input Budget            : "))

print("\nTengah Tahun= Hotel Stay= 45% of your budget")
print("Akhir Tahun= Camp= 25% of your budget")
waktu_liburan = input("Pilihan Waktu Liburan    :").lower()

penginapan = ""
if waktu_liburan == "tengah tahun":
    penginapan = "Hotel/Motel"
    print("\nDestination Choices:")
    print("1. Tana Toraja (15% of your budget)")
    print("2. Taman Laut Bunaken (20% of your budget)")
    print("3. Kawah Ijen (10% of your budget)\n")
elif waktu_liburan == "akhir tahun":
    penginapan = "Camping"
    print("\nDestination Choices:")
    print("1. Raja Ampat (40% of your budget)")
    print("2. Diamond Beach (30% of your budget)")
    print("3. Taman Nasional Gunung Leuser (25% of your budget)\n")
else:
    print("System Error")

destinasi = int(input("Pilihan Destinasi: "))
perjalanan_penginapan = 0
lainnya = 0
total = 0
kondisi = 0
status = ""

if waktu_liburan == "tengah tahun":
    if destinasi == 1:
        perjalanan_penginapan = (budget * 45 / 100) + (budget * 15 / 100)
        lainnya = 50 / 100 * budget
        total = perjalanan_penginapan + lainnya
    elif destinasi == 2:
        perjalanan_penginapan = (budget * 45 / 100) + (budget * 20 / 100)
        lainnya = 50 / 100 * budget
        total = perjalanan_penginapan + lainnya
    elif destinasi == 3:
        perjalanan_penginapan = (budget * 45 / 100) + (budget * 10 / 100)
        lainnya = 50 / 100 * budget
        total = perjalanan_penginapan + lainnya
elif waktu_liburan == "akhir tahun":
    if destinasi == 1:
        perjalanan_penginapan = (budget * 25 / 100) + (budget * 40 / 100)
        lainnya = 50 / 100 * budget
        total = perjalanan_penginapan + lainnya
    elif destinasi == 2:
        perjalanan_penginapan = (budget * 25 / 100) + (budget * 30 / 100)
        lainnya = 50 / 100 * budget
        total = perjalanan_penginapan + lainnya
    elif destinasi == 3:
        perjalanan_penginapan = (budget * 25 / 100) + (budget * 25 / 100)
        lainnya = 50 / 100 * budget
        total = perjalanan_penginapan + lainnya

if budget == total:
    status = ""
elif budget < total:
    kondisi = total - budget
    status = "Budget Kamu Kurang: " + str(kondisi)
elif budget > total:
    kondisi = budget - total
    status = "Budget Kamu Lebih: " + str(kondisi)
else:
    status = "System Error"

print("\n====================== Plan Summary ======================")
print("Waktu Liburan Dilakukan: " + waktu_liburan)
print("Penginapan: " + penginapan)
print("Estimasi Perjalanan dan Penginapan: " + str(perjalanan_penginapan))
print("Estimasi Pengeluaran Lainnya: " + str(lainnya))
print("Estimasi Pengeluaran Total: " + str(total))
print(status)
