"""
Pertemuan 04
[PRAKTIKUM] program untuk mengecek level kesulitan sebuah test.

@author 2473021-Febrianus Leona Putra
@version 08 Oktober 2024

"""
peserta1 = float(input("Peserta di Test 1             : "))
lulus1 = float(input("Peserta yang lulus di Test 1  : "))
peserta2 = float(input("Peserta di Test 2             : "))
lulus2 = float(input("Peserta yang lulus di Test 2  : "))
peserta3 = float(input("Peserta di Test 3             : "))
lulus3 = float(input("Peserta yang lulus di Test 3  : "))
peserta4 = float(input("Peserta di Test 4             : "))
lulus4 = float(input("Peserta yang lulus di Test 4  : "))
peserta5 = float(input("Peserta di Test 5             : "))
lulus5 = float(input("Peserta yang lulus di Test 5  : "))

persenLulus1 = lulus1/peserta1*100
persenLulus2 = lulus2/peserta2*100
persenLulus3 = lulus3/peserta3*100
persenLulus4 = lulus4/peserta4*100
persenLulus5 = lulus5/peserta5*100

mudah = 0
sedang = 0
sulit = 0

level1=""
if persenLulus1 >= 70:
    level1 = "Mudah"
    mudah += 1
elif persenLulus1 >= 40 and persenLulus2 < 70:
    level1 = "Sedang"
    sulit += 1
elif persenLulus1 < 40:
    level1 = "Sulit"
    sulit += 1

level2=""
if persenLulus2 >= 70:
    level2 = "Mudah"
    mudah += 1
elif persenLulus2 >= 40 and persenLulus2 < 70:
    level2 = "Sedang"
    sulit += 1
elif persenLulus2 < 40:
    level2 = "Sulit"
    sulit += 1
    
level3=""
if persenLulus3 >= 70:
    level3 = "Mudah"
    mudah += 1
elif persenLulus3 >= 40 and persenLulus3 < 70:
    level3 = "Sedang"
    sulit += 1
elif persenLulus3 < 40:
    level3 = "Sulit"
    sulit += 1

level4=""  
if persenLulus3 >= 70:
    level4 = "Mudah"
    mudah += 1
elif persenLulus3 >= 40 and persenLulus3 < 70:
    level4 = "Sedang"
    sulit += 1
elif persenLulus3 < 40:
    level4 = "Sulit"
    sulit += 1

level5=""
if persenLulus4 >= 70:
    level5 = "Mudah"
    mudah += 1
elif persenLulus4 >= 40 and persenLulus4 < 70:
    level5 = "Sedang"
    sulit += 1
elif persenLulus4 < 40:
    level5 = "Sulit"
    sulit += 1

print("========== Rincian Test ==========")
print("Nama Test       || Persentase Kelulusan || Level")
print("Test 1          ||" ,persenLulus1, "                   ||" , level1)
print("Test 1          ||" ,persenLulus2, "                   ||" , level2)
print("Test 1          ||" ,persenLulus3, "                   ||" , level3)
print("Test 1          ||" ,persenLulus4, "                   ||" , level4)
print("Test 1          ||" ,persenLulus5, "                   ||" , level5)

print("=========== Hasil Test ===========")
print("Jumlah Level Mudah =" , mudah)
print("Jumlah Level Sedang =" , sedang)
print("Jumlah Level Sulit =" , sulit)

if sedang >= 2 and sulit >= 1 or sulit >= 2:
    print("\nTarget Tercapai")
else:
    print("\nTarget Gagal Tercapai")