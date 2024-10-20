#FOR-LOOP spesifikasi FOR-EACH
print("FOR-LOOP:")
#1. i in list(range(10)) <- fase inisial i untuk mengambil angka dari list angka 0 s.d 9
for i in list(range(10)):
    #2. statment yang dijalankan jika i masih dapat mengambil nilai dari list angka 0 s.d 9
    print (i, end=" ")
print("\n\n")
print("WHILE-LOOP:")
#WHILE-LOOP
#1. inisialisasi variable counter
a = 0
#2. a < 10; <- fase pengecekan / conditions: True akan loop False akan selesai
while a<10 :
    #3. statment yang dijalankan jika While Loop bernilai True
    print(a, end= " ")
    #4. a++ <- fase increment / decrement
    a+=1