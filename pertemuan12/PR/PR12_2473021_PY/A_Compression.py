"""
Pertemuan 12
[PR] Program yang dapat menyingkat input dengan format huruf-banyak huruf-huruf-banyak huruf-dst.

@author 2473021-Febrianus Leona Putra
@version 15 Desember 2024

"""
def singkat(inputan):
    disingkat = ""
    count = 1

    for i in range(1, len(inputan)):
        if inputan[i] == inputan[i - 1]:
            count += 1
        else:
            disingkat += inputan[i - 1] + str(count)
            count = 1

    disingkat += inputan[-1] + (str(count) if count > 1 else "")
    return disingkat

inputan = input("Enter a string to compress: ")
output = singkat(inputan)
print("Compressed string: ", output)
