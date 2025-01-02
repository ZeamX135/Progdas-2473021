"""
Pertemuan 12
[PRAKTIKUM] Sistem yang dapat mengkonversi input kalimat menjadi lowercase, uppercase,
kebalikannya, kapital di awal, dan tanpa huruf vokal, menghitung jumlah huruf vokal,
membalikkan kalimat, dan menghasilkan status palindrom dengan mengabaikan spasi dan tidak case sensitive.

@author 2473021-Febrianus Leona Putra
@version 10 Desember 2024
"""

def konversi_kalimat(input_kalimat):
    lowercase = input_kalimat.lower()
    uppercase = input_kalimat.upper()
    opposite = input_kalimat.swapcase()
    title_case = input_kalimat.title()
    huruf_vokal = "aiueoAIUEO"
    tanpa_vokal = ''.join(char for char in input_kalimat if char not in huruf_vokal)
    
    jumlah_vokal = sum(1 for char in input_kalimat if char in huruf_vokal)
    terbalik = input_kalimat[::-1]
    cek_palindrome = ''.join(char.lower() for char in input_kalimat if char.isalnum())
    palindrome = "Ya" if cek_palindrome == cek_palindrome[::-1] else "Tidak"


    print("-------------------- Konversi --------------------")
    print("Lowercase\t\t:", lowercase)
    print("Uppercase\t\t:", uppercase)
    print("Opposite\t\t:", opposite)
    print("Title Case\t\t:", title_case)
    print("Tanpa Vokal\t\t:", tanpa_vokal)
    print("--------------------- Other ----------------------")
    print("Jumlah Vokal\t\t:", jumlah_vokal)
    print("String Terbalik\t\t:", terbalik)
    print("Palindrome\t\t:", palindrome)

kalimat = input("Input\t\t: ")
konversi_kalimat(kalimat)
