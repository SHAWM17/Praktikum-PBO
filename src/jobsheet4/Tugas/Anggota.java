package jobsheet4.Tugas;

public class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    // RELASI DEPENDENCY: Buku hanya dijadikan parameter method, tidak disimpan sebagai atribut
    public void pinjamBuku(Buku buku) {
        System.out.println(nama + " berhasil meminjam buku berjudul: " + buku.getJudul());
    }
}
