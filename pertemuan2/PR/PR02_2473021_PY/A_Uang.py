"""
Pertemuan 02
[PR] Membuat Program Konversi Uang dari rupiah ke Dollar Amerika(USD) dan EURO (EUR)

@author 2473021-Febrianus Leona Putra
@version 29 September 2024

"""
# Input
print(".......:=Konversi Mata Uang=:.......")
rupiah = float(input("jumlah uang dalam Rupiah: Rp "))

# Process
usd = rupiah*0.06601
eur = rupiah*0.05913

# Output
print("Dolar Amerika (USD)     :" , usd)
print("Euro (EUR)              :" , eur)
