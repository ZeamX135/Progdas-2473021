"""
Pertemuan 11
[PRAKTIKUM] program dalam bahasa Java untuk menentukan bilangan prima dalam rentang tertentu.

@author 2473021-Febrianus Leona Putra
@version 03 Desember 2024
"""
def prima (x):
  if x < 2:
    return False
  for i in range(2, x):
    if x % i == 0:
      return False

  return True

def cari_bilangan_prima (awal, akhir):
  list_bilangan_prima = []

  for x in range(awal, akhir + 1):
    if prima(x):
      list_bilangan_prima.append(x)

  return list_bilangan_prima

def cetak_bilangan_prima(awal, akhir):
    print(f"Bilangan prima dalam rentang {awal} hingga {akhir} adalah: ", end="")
    for angka in range(awal, akhir + 1):
        if prima(angka):
            print(angka, end=" ")
    print()

angka_awal = int(input("Masukkan angka awal: "))
angka_akhir = int(input("Masukkan angka akhir: "))

cetak_bilangan_prima(angka_awal, angka_akhir)
