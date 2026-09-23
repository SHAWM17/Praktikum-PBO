package tugas;

public class Parfum {
    public String merk;
    public String nama;
    public double harga;

    public void setDetail(String merk, String nama, double harga) {
        this.merk = merk;
        this.nama = nama;
        this.harga = harga;
    }

    public void semprot() {
        System.out.println("Menyemprotkan parfum " + merk + " - " + nama + ". Terasa harum dan segar!");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Parfum ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp " + (long) harga);
        System.out.println();
    }
}
