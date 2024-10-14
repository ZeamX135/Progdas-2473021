"""
Pertemuan 04
[PRAKTIKUM] program kalkulator, dimana pengguna diminta untuk memilih operator penjumlahan, pengurangan, perkalian, atau pembagian.

@author 2473021-Febrianus Leona Putra
@version 08 Oktober 2024

"""
print("========== KALKULATOR ==========")
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")
print("================================")

operator = int(input("Pilih operator : "))

if(operator == 1):
    a1 = int(input("\nAngka pertama: "))
    a2 = int(input("Angka kedua: "))
    print("================================")
    tambah = a1 + a2
    print("hasil penambahan" , a1 , "dan" , a2 , "adalah" , tambah)
elif(operator == 2):
    a1 = int(input("\nAngka pertama: "))
    a2 = int(input("Angka kedua: "))
    print("================================")
    kurang = a1 - a2
elif(operator == 3):
    a1 = int(input("\nAngka pertama: "))
    a2 = int(input("Angka kedua: "))
    print("================================")
    kali = a1 * a2
elif(operator == 4):
    a1 = int(input("\nAngka pertama: "))
    a2 = int(input("Angka kedua: "))
    print("================================")
    if(a2==0):
        print("hasil pembagian" , a1 , "dan" , a2 , "adalah tak terhingga")
    else:
        bagi = a1 * a2
        print("hasil pembagian" , a1 , "dan" , a2 , "adalah" , bagi)
else:
    print("\nPilihan Tidak Valid")
            
