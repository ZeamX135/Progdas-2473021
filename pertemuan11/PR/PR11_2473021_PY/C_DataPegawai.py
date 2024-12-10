"""
Pertemuan 11
[PR] Program untuk mengelola data pegawai

@author 2473021-Febrianus Leona Putra
@version 06 Desember 2024

"""
data_pegawai = []

def tambah_pegawai():
    nama = input("Masukkan nama pegawai: ")
    jabatan = input("Masukkan jabatan: ")
    gaji = input("Masukkan gaji: ")

    if gaji.isdigit():
        gaji = int(gaji)
        data_pegawai.append({"Nama": nama, "Jabatan": jabatan, "Gaji": gaji})
        print("Pegawai berhasil ditambahkan!")
    else:
        print("Gaji harus berupa angka.")

def tampilkan_daftar_pegawai():
    if not data_pegawai:
        print("Belum ada data pegawai.")
        return

    print("\nDaftar Pegawai:")
    print(f"{'No':<5}{'Nama':<10}{'Jabatan':<10}{'Gaji':<10}")
    no = 1
    for pegawai in data_pegawai:
        print(f"{no:<5}{pegawai['Nama']:<10}{pegawai['Jabatan']:<10}{pegawai['Gaji']:<10}")
        no += 1

def main():
    while True:
        print("\nMenu Pengelolaan Data Pegawai:")
        print("1. Tambah Pegawai")
        print("2. Tampilkan Daftar Pegawai")
        print("3. Keluar")
        pilihan = input("Pilih menu: ")

        if pilihan == "1":
            tambah_pegawai()
        elif pilihan == "2":
            tampilkan_daftar_pegawai()
        elif pilihan == "3":
            print("Program selesai.")
            break
        else:
            print("Pilihan tidak valid. Silakan pilih menu yang tersedia.")

if __name__ == "__main__":
    main()
