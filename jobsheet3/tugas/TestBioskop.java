package jobsheet3.tugas;

public class TestBioskop {
    public static void main(String[] args) {
        // Uji coba membuat objek dengan hargaDasar negatif (-50000)
        Tiket tiket1 = new Tiket("Avengers: Endgame", -50000);

        System.out.println("Film: " + tiket1.getJudulFilm());
        System.out.println("Harga Tiket: " + tiket1.getHargaDasar());
        System.out.println("Status Lunas? " + tiket1.isStatusPembayaran());

        System.out.println("\nMemproses pembayaran...");
        tiket1.lakukanPembayaran();
        System.out.println("Status Lunas Terbaru? " + tiket1.isStatusPembayaran());
    }
}
