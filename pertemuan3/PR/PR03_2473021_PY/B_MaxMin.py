"""
Pertemuan 03
[PR] Membuat Program dimana user diminta untuk menginput 3 nilai bilangan bulat yaitu a,b,c dan mengkategorikan berdasarkan angka terbesar, tengah, dan terkecil

@author 2473021-Febrianus Leona Putra
@version 06 Oktober 2024

"""
# Input
print("Input :")
a = int(input("a : "))
b = int(input("b : "))
c = int(input("c : "))

# Process
if (a > b and a > c):
    terbesar = a
elif (b > a and b > c):
    terbesar = b
else:
    terbesar = c

if (a < b and a < c):
    terkecil = a
elif (b < a and b < c):
    terkecil = b
else:
    terkecil = c

if (a != terbesar and a != terkecil):
    tengah = a
elif (b != terbesar and b != terkecil):
    tengah = b
else:
    tengah = c

# Output
print("Output :")
print("Nilai",tengah,"di antara",terbesar,"dan",terkecil)
print("Nilai terbesar adalah",terbesar)
print("Nilai terkecil",terkecil)
