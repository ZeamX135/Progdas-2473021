package pertemuan13.Prak;

public class A_MahasiswaPBO {

    // Atribut
    private String nrp;
    private String nama;
    private float uts;
    private float uas;
    private float kat;
    private float nilai_akhir;
    private String nilai_mutu;

    // Konstruktor
    public A_MahasiswaPBO() {
    }

    // Setter
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }

    public void setKat(float kat) {
        this.kat = kat;
    }

    // Metode untuk menghitung nilai akhir
    private void hitungNilaiAkhir() {
        this.nilai_akhir = (0.3f * uts) + (0.3f * uas) + (0.4f * kat);
    }

    // Metode untuk menentukan nilai mutu
    private void tentukanNilaiMutu() {
        if (nilai_akhir >= 80) {
            nilai_mutu = "A";
        } else if (nilai_akhir >= 73) {
            nilai_mutu = "B+";
        } else if (nilai_akhir >= 67) {
            nilai_mutu = "B";
        } else if (nilai_akhir >= 61) {
            nilai_mutu = "C+";
        } else if (nilai_akhir >= 55) {
            nilai_mutu = "C";
        } else if (nilai_akhir >= 41) {
            nilai_mutu = "D";
        } else {
            nilai_mutu = "E";
        }
    }

    // Override metode toString()
    @Override
    public String toString() {
        hitungNilaiAkhir();
        tentukanNilaiMutu();
        return "NRP: " + nrp + "\n"
                + "Nama: " + nama + "\n"
                + "UTS: " + uts + "\n"
                + "UAS: " + uas + "\n"
                + "KAT: " + kat + "\n"
                + "Nilai Akhir: " + nilai_akhir + "\n"
                + "Nilai Mutu: " + nilai_mutu;
    }
}
