package jobsheet6.tugas;

public class TestTiket {
    public static void main(String[] args) {
        // 1. Tiket Kereta (Dibuat menggunakan konstruktor tanpa parameter & diisi satu per satu)
        TiketKereta tk = new TiketKereta();
        tk.kodeTiket = "KA-001";
        tk.namaPenumpang = "Andi";
        tk.asal = "Malang";
        tk.tujuan = "Jakarta";
        tk.setHargaDasar(350000);
        tk.nomorGerbong = 3;
        tk.nomorKursi = "12A";

        System.out.println("======== Tiket Kereta ========");
        tk.tampilKereta();
        System.out.println();

        // 2. Tiket Pesawat Domestik (Konstruktor berparameter)
        TiketDomestik td = new TiketDomestik(
            "GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000
        );

        System.out.println("======== Tiket Pesawat Domestik ========");
        td.tampilDomestik();
        System.out.println();

        // 3. Tiket Pesawat Internasional (Konstruktor berparameter)
        TiketInternasional ti = new TiketInternasional(
            "SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000
        );

        System.out.println("======== Tiket Pesawat Internasional ========");
        ti.tampilInternasional();
    }
}
