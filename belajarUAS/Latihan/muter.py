def spiral_matrix(n):
    # Inisialisasi matriks kosong
    matrix = [[0] * n for _ in range(n)]
    
    # Tentukan titik tengah matriks
    x, y = n // 2, n // 2
    
    # Arah gerakan: kanan, bawah, kiri, atas
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    current_direction = 0  # Mulai dari arah kanan
    
    # Mulai isi angka dari 1 sampai n*n
    number = 1
    steps = 1  # Jumlah langkah untuk setiap arah gerakan
    while number <= n * n:
        for _ in range(2):  # Ulangi setiap langkah 2 kali (untuk 1 putaran spiral)
            for _ in range(steps):  # Gerakan sebanyak "steps" ke arah tertentu
                if number > n * n:
                    break
                # Isi angka di posisi saat ini
                matrix[x][y] = number
                number += 1
                
                # Pindah ke posisi berikutnya
                dx, dy = directions[current_direction]
                x, y = x + dx, y + dy
            
            # Ganti arah gerakan
            current_direction = (current_direction + 1) % 4
        
        # Tambah langkah untuk gerakan spiral
        steps += 1
    
    return matrix

def print_matrix(matrix):
    for row in matrix:
        print(" ".join(f"{num:2}" for num in row))

# Input ukuran matriks dari pengguna
n = int(input("Masukkan ukuran matriks (n): "))
if n % 2 == 0:
    print("Ukuran matriks harus ganjil!")
else:
    result = spiral_matrix(n)
    print("Output Spiral:")
    print_matrix(result)
