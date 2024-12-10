"""
Pertemuan 11
[PR] Sebuah program menggunakan fungsi dan prosedur untuk menganalisis data nilai mahasiswa.

@author 2473021-Febrianus Leona Putra
@version 06 Desember 2024

"""
import statistics

arr_nilai = []
jumlah = int(input("Masukkan jumlah mahasiswa: "))

for i in range(jumlah):
    nilai = int(input(f"Masukkan nilai mahasiswa ke-{i+1}: "))
    arr_nilai.append(nilai)

def rumus():
    besar = max(arr_nilai)
    kecil = min(arr_nilai)
    rataRata = statistics.mean(arr_nilai)
    return besar, kecil, rataRata

besar, kecil, rataRata = rumus()

print("Statistik Nilai Mahasiswa:")
print(f"Rata-rata nilai: {rataRata:.2f}")
print("Nilai maksimum : ", besar)
print("Nilai minimum : ", kecil)