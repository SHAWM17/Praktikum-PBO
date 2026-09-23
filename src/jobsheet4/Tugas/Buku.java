package jobsheet4.Tugas;

public class Buku {
    private String judul;
    private Penulis penulis; // RELASI AGGREGATION: Disimpan sebagai atribut

    // Penulis diterima dari luar (Aggregation)
    public Buku(String judul, Penulis penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public Penulis getPenulis() {
        return penulis;
    }
}
