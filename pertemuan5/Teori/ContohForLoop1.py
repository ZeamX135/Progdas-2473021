nama = input("Masukkan nama anda: ")
print("FOR-LOOP")
for i in list(range(len(nama))):
    print(nama[i], end=" ")

print("\n")

a = 0
print("WHILE-LOOP")
while a < len(nama):
    print(nama[a], end=" ")
    a += 1