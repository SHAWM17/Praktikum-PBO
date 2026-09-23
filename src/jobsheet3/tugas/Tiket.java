package jobsheet3.tugas;

public class Tiket {
    // Atribut bertipe private sesuai arsitektur enkapsulasi
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    // Konstruktor
    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        
        // Validasi: Jika hargaDasar < 0, otomatis diset ke nilai default 35000
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }

        // Status pembayaran awal diset false (Belum Dibayar)
        this.statusPembayaran = false;
    }

    // Method Getter untuk judulFilm
    public String getJudulFilm() {
        return judulFilm;
    }

    // Method Getter untuk hargaDasar
    public double getHargaDasar() {
        return hargaDasar;
    }

    // Method Getter untuk statusPembayaran (Read-Only)
    // Menggunakan penamaan isStatusPembayaran() menyesuaikan pemanggilan pada gambar TestBioskop
    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    // Method untuk memproses pembayaran (mengubah status menjadi true)
    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }
}
