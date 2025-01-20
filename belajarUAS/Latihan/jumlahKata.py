from collections import Counter


# Meminta pengguna memasukkan kalimat
kalimat = input("Masukkan kalimat: ")
    
# Membagi kalimat menjadi daftar kata (case insensitive)
kata_list = kalimat.lower().split()
    
# Menghitung frekuensi setiap kata
frekuensi = Counter(kata_list)
    
# Mendapatkan 5 kata dengan frekuensi terbanyak
kata_terbanyak = frekuensi.most_common(5)
    
# Menampilkan hasil
print("\n5 kata dengan penyebutan terbanyak:")
for kata, jumlah in kata_terbanyak:
    print(f"{kata}: {jumlah}")

