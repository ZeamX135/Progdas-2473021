"""
Pertemuan 03
[PR] Membuat program yang dapat mengkonversi tanggal dari format numerik (hari, bulan,tahun) menjadi format teks dengan nama bulan dalam Bahasa Indonesia

@author 2473021-Febrianus Leona Putra
@version 06 Oktober 2024

"""

print("Input:")
day = int(input("Tanggal   : "))
month = int(input("Bulan     : "))
year = int(input("Tahun     : ")) + 2000

kabisat = year % 400 == 0 or (year % 100 != 0 and year % 4 == 0)

days_in_month = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

if kabisat:
    days_in_month[2] = 29

months = [
    "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
    "Juli", "Agustus", "September", "Oktober", "November", "Desember"
]

is_valid_date = True
if month < 1 or month > 12:
    is_valid_date = False
elif day < 1 or day > days_in_month[month]:
    is_valid_date = False

print("\nOutput:")
print(f"Konversi: {day} {months[month]} {year}")

if not is_valid_date:
    print(f"Tidak ada tanggal {day} di bulan {months[month]} tahun {year}")
