a = input("Masukkan sebuah angka : ")
if int(a) >= 0:
    print(a,"positif")
elif int(a)==0:
    print(a,"bilangan nol")
else:
    print(a,"negatif")

# single statement
print(a, "positif") if a >= 0 else print(a,"negatif")

hasil = (a, "positif") if a >= 0 else (a, "negatif")