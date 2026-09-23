package tugas;

public class Sepatu {
    public String brand;
    public double harga;

    public void setSepatu(String brand, double harga) {
        this.brand = brand;
        this.harga = harga;
    }

    public void bersihkan() {
        System.out.println("Membersihkan sepatu merk " + brand + " agar tetap terawat.");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Sepatu (Umum) ===");
        System.out.println("Merk  : " + brand);
        System.out.println("Harga : Rp " + (long) harga);
        System.out.println();
    }
}
