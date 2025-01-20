"""
Pertemuan 09
[PRAKTIKUM]  Program Gambaran sederhana tentang enkripsi, misalnya mengganti huruf a dengan j, b dengan k dan seterusnya

@author 2473021-Febrianus Leona Putra
@version 19 Oktober 2024
"""
teks = input("Masukkan Kalimat: ")

tabelsubstitusi = {
    'A': 'J', 'B': 'K', 'C': 'L', 'D': 'M', 'E': 'N', 'F': 'O', 'G': 'P', 'H': 'Q', 'I': 'R',
    'J': 'S', 'K': 'T', 'L': 'U', 'M': 'V', 'N': 'W', 'O': 'X', 'P': 'Y', 'Q': 'Z', 'R': 'A',
    'S': 'B', 'T': 'C', 'U': 'D', 'V': 'E', 'W': 'F', 'X': 'G', 'Y': 'H', 'Z': 'I'
}


terenkripsi = []
for karakter in teks:
    if karakter.isalpha():
        if karakter.isupper():
            terenkripsi.append(tabelsubstitusi[karakter])
        else:
            terenkripsi.append(tabelsubstitusi[karakter.upper()].lower())
    elif karakter == ' ':
        terenkripsi.append('%')
    else:
        terenkripsi.append('$')

teksterenkripsi = ''.join(terenkripsi)
print("Hasil Enkripsi:", teksterenkripsi)
