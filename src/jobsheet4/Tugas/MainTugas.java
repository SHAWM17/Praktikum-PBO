package jobsheet4.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Uji Aggregation
        Penulis p1 = new Penulis("Pramoedya Ananta Toer");
        Buku b1 = new Buku("Bumi Manusia", p1);
        System.out.println("Buku: " + b1.getJudul() + " ditulils oleh " + b1.getPenulis().getNama());

        // 2. Uji Composition
        Rak rakA = new Rak("A1", 3);
        rakA.tampilkanKoleksi();

        // 3. Uji Dependency
        Anggota anggota = new Anggota("Budi");
        anggota.pinjamBuku(b1);
    }
}
