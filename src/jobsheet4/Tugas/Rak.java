package jobsheet4.Tugas;

public class Rak {
    private String kodeRak;
    private Buku[] daftarBuku; // RELASI COMPOSITION: Rak memiliki koleksi Buku

    public Rak(String kodeRak, int kapasitas) {
        this.kodeRak = kodeRak;
        this.daftarBuku = new Buku[kapasitas];
        this.initBuku();
    }

    // RELASI COMPOSITION: Objek Buku dibuat langsung di dalam class Rak
    private void initBuku() {
        Penulis defaultPenulis = new Penulis("Anonim");
        for (int i = 0; i < daftarBuku.length; i++) {
            this.daftarBuku[i] = new Buku("Buku Default " + (i + 1), defaultPenulis);
        }
    }

    public void tampilkanKoleksi() {
        System.out.println("--- Koleksi Rak " + kodeRak + " ---");
        for (Buku b : daftarBuku) {
            System.out.println("Judul: " + b.getJudul() + " | Penulis: " + b.getPenulis().getNama());
        }
    }
}
