import random

def main():
    print("Selamat datang di permainan Tebak Angka!")
    while True:
        print("\nPilih level kesulitan:")
        print("1. Mudah (1-50, 10 percobaan)")
        print("2. Sedang (1-100, 7 percobaan)")
        print("3. Sulit (1-200, 5 percobaan)")

        # Validasi input level kesulitan
        try:
            pilihan = int(input("Masukkan pilihan (1/2/3): "))
            if pilihan not in [1, 2, 3]:
                raise ValueError
        except ValueError:
            print("Input tidak valid! Harap masukkan angka 1, 2, atau 3.")
            continue

        # Menentukan batas angka dan jumlah percobaan berdasarkan level kesulitan
        if pilihan == 1:
            batas = 50
            kesempatan = 10
        elif pilihan == 2:
            batas = 100
            kesempatan = 7
        else:
            batas = 200
            kesempatan = 5

        angka_target = random.randint(1, batas)
        print(f"\nTebak angka antara 1 hingga {batas}.")
        print(f"Anda memiliki {kesempatan} percobaan.\n")

        for percobaan in range(1, kesempatan + 1):
            try:
                tebakan = int(input(f"Masukkan tebakan Anda ({percobaan}/{kesempatan}): "))
                if tebakan < 1 or tebakan > batas:
                    raise ValueError
            except ValueError:
                print(f"Harap masukkan angka antara 1 dan {batas}.")
                continue

            if tebakan == angka_target:
                print(f"Benar! Anda menebak dalam {percobaan} percobaan.")
                break
            elif abs(tebakan - angka_target) <= 5:
                print("Sangat dekat!")
            elif tebakan < angka_target:
                print("Terlalu rendah.")
            else:
                print("Terlalu tinggi.")
        else:
            print(f"Maaf, Anda kehabisan percobaan! Angka yang benar adalah {angka_target}.")

        # Menanyakan apakah ingin bermain lagi
        ulang = input("\nIngin bermain lagi? (y/n): ").strip().lower()
        if ulang != 'y':
            print("Terima kasih telah bermain!")
            break

if __name__ == "__main__":
    main()
