detikAwal = int(input("Input Detik : "))

jam = int(detikAwal//3600)
sisaDetik = int(detikAwal % 3600)
menit = int(sisaDetik / 60)
detik = int(sisaDetik % 60)

print()
print("Jumlah jam, menit dan detik sisa dari",detikAwal,"detik :")
print(jam, "jam",menit, "menit",detik, "detik")