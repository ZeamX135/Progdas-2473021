"""
Pertemuan 02
[PRAKTIKUM] Membuat Program Derajat

@author 2473021-Febrianus Leona Putra
@version 24 September 2024

"""

# Input
print(".:=Sistem Converter Suhu=:.")
print("***************************")
reamur = float(input("Reamur          : "))

# Process
celcius = 5.0 / 4 * reamur
kelvin = celcius + 273
fahrenheit = (9.0 / 4 * reamur) + 32

# Output
print("Celcius         :",celcius)
print("Kelvin          :",kelvin)
print("Fahrenheit      :",fahrenheit)