package pertemuan13.Prak;

public class A_MahasiswaDirector {

    public A_MahasiswaDirector() {
        A_MahasiswaPBO newMahasiswaPBO = new A_MahasiswaPBO();
        newMahasiswaPBO.setNrp("217397");
        newMahasiswaPBO.setNama("Martin Juan");
        newMahasiswaPBO.setUts(60f);
        newMahasiswaPBO.setUas(77f);
        newMahasiswaPBO.setKat(65f);
        System.out.println(newMahasiswaPBO.toString());
    }

    public static void main(String[] args) {
        new A_MahasiswaDirector();
    }
}
