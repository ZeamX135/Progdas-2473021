"""
Pertemuan 09
[PR] program yang meminta inputan dua deret bilangan bulat dan setiap deret disimpan ke dalam array masing-masing.

@author 2473021-Febrianus Leona Putra
@version 24 November 2024

"""
print("Input :")
input1 = input("Deret 1 : ")
input2 = input("Deret 2 : ")

deret1 = list(map(int, input1.split(" ")))
deret2 = list(map(int, input2.split(" ")))
gabungan = deret1 + deret2
gabungan_terurut = sorted(set(gabungan))

print("Output :")
print("Hasil list gabungan terurut tanpa angka duplikat:")
print(*gabungan_terurut)
