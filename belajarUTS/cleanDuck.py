print("Welcome to CleanDUCK Indonesia!")

print("\nSilahkan Masukkan Data Pelanggan:")
nama = input("Nama: ")

valid = False
while not valid:
    try:
        no_tlp = int(input("Nomor Telepon: "))  # Menggunakan input() dan mengkonversi ke int
        valid = True  # Input valid, keluar dari loop
    except ValueError:
        print("Input salah. Harap masukkan nomor telepon berupa angka.")

tim_bola = input("Tim Bola Kesayangan: ")

print(f"\nHalo {nama}, silahkan pilih layanan jasa yang Anda inginkan:")
print("1. Premium Washing Rp 100.000")
print("2. Washing and Wax Rp 120.000")
print("3. Full Package Rp 550.000")
pilihan = int(input("Pilihan anda: "))  # Menggunakan input() dan mengkonversi ke int

layanan = ""
if pilihan == 1:
    layanan = "1. Premium Washing, Rp 100.000,00"
elif pilihan == 2:
    layanan = "2. Washing and Wax, Rp 120.000,00"
elif pilihan == 3:
    layanan = "3. Full Package, Rp 550.000,00"
else:
    layanan = "Pilihan tidak valid"  # Menangani pilihan yang tidak valid

print(f"\nPelanggan: {nama}")
print(f"Nomor Telepon: {no_tlp}")
print(f"Tim Bola Kesayangan: {tim_bola}")
print(f"Layanan: {layanan}")