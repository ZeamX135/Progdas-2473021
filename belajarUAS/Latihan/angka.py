# Input jumlah elemen dan elemen list A
jumlah_a = int(input("Jumlah list A: "))
list_a = list(map(int, input("Masukkan elemen list A: ").split()))

# Input jumlah elemen dan elemen list B
jumlah_b = int(input("Jumlah list B: "))
list_b = list(map(int, input("Masukkan elemen list B: ").split()))

# Operasi himpunan
set_a = set(list_a)
set_b = set(list_b)

# Irisan (intersection) secara terurut
irisan = sorted(set_a & set_b)

# Gabungan (union) tanpa duplikat dan terurut
gabungan = sorted(set_a | set_b)

# Pengurangan (set difference) B - A
pengurangan = list_b.copy()
for elemen in list_a:
    while elemen in pengurangan:
        pengurangan.remove(elemen)

# Symmetric Difference secara terurut
sym_diff = sorted(set_a ^ set_b)

# Menampilkan hasil
print(f"Irisan list A dan B (terurut): {', '.join(map(str, irisan))}")
print(f"Gabungan list A dan B (terurut): {', '.join(map(str, gabungan))}")
print(f"list B - list A: {', '.join(map(str, pengurangan))}")
print(f"Symmetric Difference (terurut): {', '.join(map(str, sym_diff))}")
