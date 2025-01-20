# Program untuk menyusun jadwal kegiatan
def main():
    kegiatan_list = masukkan_kegiatan()
    slot_pagi, slot_siang, pending = susun_jadwal(kegiatan_list)
    tampilkan_jadwal(slot_pagi, slot_siang, pending)

def masukkan_kegiatan():
    kegiatan_list = []
    jumlah_kegiatan = int(input("Masukkan jumlah kegiatan: "))

    for i in range(1, jumlah_kegiatan + 1):
        print(f"\nMasukkan kegiatan ke-{i}:")
        nama = input("Nama: ")
        durasi = int(input("Durasi (jam): "))
        prioritas = int(input("Prioritas (1-5): "))
        kegiatan = {"nama": nama, "durasi": durasi, "prioritas": prioritas}
        kegiatan_list.append(kegiatan)
    
    return kegiatan_list

# Fungsi pengurutan berdasarkan prioritas dan durasi
def sort_by_prioritas_dan_durasi(kegiatan):
    return (kegiatan["prioritas"], kegiatan["durasi"])

def susun_jadwal(kegiatan_list):
    # Mengurutkan kegiatan berdasarkan prioritas dan durasi menggunakan fungsi terpisah
    kegiatan_list.sort(key=sort_by_prioritas_dan_durasi)
    
    slot_pagi = []
    slot_siang = []
    pending = []

    total_pagi = 0
    total_siang = 0

    for kegiatan in kegiatan_list:
        if total_pagi + kegiatan["durasi"] <= 6:
            slot_pagi.append(kegiatan)
            total_pagi += kegiatan["durasi"]
        elif total_siang + kegiatan["durasi"] <= 6:
            slot_siang.append(kegiatan)
            total_siang += kegiatan["durasi"]
        else:
            pending.append(kegiatan)
    
    return slot_pagi, slot_siang, pending

def tampilkan_jadwal(slot_pagi, slot_siang, pending):
    print("\n=== Jadwal Kegiatan ===")
    print("Slot Pagi:")
    for kegiatan in slot_pagi:
        print("- " + kegiatan['nama'] + " (" + str(kegiatan['durasi']) + " jam)")
    
    print("\nSlot Siang:")
    for kegiatan in slot_siang:
        print("- " + kegiatan['nama'] + " (" + str(kegiatan['durasi']) + " jam)")
    
    if pending:
        print("\nPending:")
        for kegiatan in pending:
            print("- " + kegiatan['nama'] + " (" + str(kegiatan['durasi']) + " jam)")
    else:
        print("\nTidak ada kegiatan pending.")

if __name__ == "__main__":
    main()
