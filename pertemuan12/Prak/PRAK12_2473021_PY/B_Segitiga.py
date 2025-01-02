"""
Pertemuan 12
[PRAKTIKUM] sistem yang menerima input panjang sisi a, panjang sisi b, dan sudut b dari sebuah segitiga.

@author 2473021-Febrianus Leona Putra
@version 10 Desember 2024
"""
import math

def hitungA(a, b, sudut_B):
    sudut_B_Radian = math.radians(sudut_B)
    sudut_A_Radian = math.asin(math.sin(sudut_B_Radian) * a/b)
    sudut_A = math.degrees(sudut_A_Radian)
    return sudut_A

print("Sudut dan panjang sisi segitiga")
a = int(input("Masukkan panjang sisi a: "))
b = int(input("Masukkan panjang sisi b: "))
sudut_B = int(input("Masukkan sudut b: "))
sudut_A = hitungA(a, b, sudut_B)

print("\nDalam segitiga ABC, jika")
print("(a =", a,"),", sep="")
print("(b =", b,"),", sep="")
print("dan (C =", sudut_B, "^\circ),", sep="")
print("cari sudut (A) menggunakan hukum sin!")
print(f"\nSudut (A): {sudut_A:.2f}")
