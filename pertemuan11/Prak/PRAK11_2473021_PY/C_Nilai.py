"""
Pertemuan 11
[PRAKTIKUM] program untuk menghitung nilai akhir.

@author 2473021-Febrianus Leona Putra
@version 03 Desember 2024
"""

def nilaiAkhir(uts, uas, kat):
    return (uts * 0.25) + (uas * 0.25) + (kat * 0.5)

def nilaiMutu(nilai_akhir):
    if nilai_akhir >= 80:
        return "A"
    elif 73 <= nilai_akhir < 80:
        return "B+"
    elif 67 <= nilai_akhir < 73:
        return "B"
    elif 61 <= nilai_akhir < 67:
        return "C+"
    elif 55 <= nilai_akhir < 61:
        return "C"
    elif 41 <= nilai_akhir < 55:
        return "D"
    else:
        return "E"
        
uts = int(input("Nilai UTS(25%)\t: "))
uas = int(input("Nilai UAS(25%)\t: "))
kat = int(input("Nilai KAT(50%)\t: "))

final = nilaiAkhir(uts, uas, kat)
mutu = nilaiMutu(final)

print("Nilai Akhir :", round(final))
print("Nilai Mutu :", mutu)
