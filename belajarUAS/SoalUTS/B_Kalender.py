from datetime import datetime, timedelta

def hitung_hari(tanggal, bulan, tahun):
    """Menghitung hari berdasarkan tanggal, bulan, dan tahun yang dimasukkan."""
    # Tanggal referensi: 13 Oktober 2024 adalah hari Senin
    referensi_tanggal = datetime(2024, 10, 13)
    referensi_hari = "Senin"  # Hari referensi

    # Tanggal input
    try:
        tanggal_input = datetime(tahun, bulan, tanggal)
    except ValueError:
        return "Tanggal tidak valid!"

    # Daftar nama hari dalam bahasa Indonesia
    nama_hari = ["Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"]

    # Hitung selisih hari dari referensi
    selisih_hari = (tanggal_input - referensi_tanggal).days

    # Tentukan hari berdasarkan selisih
    indeks_hari_referensi = nama_hari.index(referensi_hari)
    indeks_hari_input = (indeks_hari_referensi + selisih_hari) % 7

    # Pastikan indeks tetap positif
    indeks_hari_input = indeks_hari_input % 7

    return nama_hari[indeks_hari_input]

def main():
    print("========== KALENDER ==========")
    print("Referensi: 13 Oktober 2024 adalah hari Senin\n")

    try:
        tanggal = int(input("Input Tanggal: "))
        bulan = int(input("Input Bulan: "))
        tahun = int(input("Input Tahun: "))

        hasil_hari = hitung_hari(tanggal, bulan, tahun)
        if hasil_hari == "Tanggal tidak valid!":
            print("\nTanggal yang Anda masukkan tidak valid.")
        else:
            print(f"\n{tanggal} {datetime.strptime(str(bulan), '%m').strftime('%B')} {tahun} adalah hari {hasil_hari}")
    except ValueError:
        print("\nInput tidak valid! Harap masukkan angka.")

if __name__ == "__main__":
    main()
