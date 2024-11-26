"""
Pertemuan 09
[PR] Program mengenai bahasa panda, dimana jika user menginput huruf kecil maka
outputnya juga huruf kecil dan jika user menginput huruf besar maka outputnya juga huruf besar

@author 2473021-Febrianus Leona Putra
@version 24 November 2024

"""
huruf_kecil = "abcdefghijklmnopqrstuvwxyz"
huruf_besar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

kalimat = input("Masukkan kalimat: ")

enkripsi = ""

for huruf in kalimat:
    if huruf in huruf_kecil:  
        index = (huruf_kecil.index(huruf) + 6) % 26  
        enkripsi += huruf_kecil[index]
    elif huruf in huruf_besar:  
        index = (huruf_besar.index(huruf) + 6) % 26  
        enkripsi += huruf_besar[index]
    else:  
        enkripsi += huruf  


print("Hasil Enkripsi:", enkripsi)
