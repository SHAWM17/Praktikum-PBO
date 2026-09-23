package tugas;

public class SepatuSneakers extends Sepatu {
    public String bahanSol;
    public String bahanUpper;

    public void setDetailSneakers(String merk, double harga, String bahanSol, String bahanUpper) {
        super.setSepatu(merk, harga);
        this.bahanSol = bahanSol;
        this.bahanUpper = bahanUpper;
    }

    public void pakaiJalan() {
        System.out.println("Memakai sneakers " + brand + " dengan material " + bahanUpper + " untuk aktivitas kasual.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== Informasi Sepatu Sneakers ===");
        System.out.println("Merk        : " + brand);
        System.out.println("Harga       : Rp " + (long) harga);
        System.out.println("Bahan Sol   : " + bahanSol);
        System.out.println("Bahan Upper : " + bahanUpper);
        System.out.println();
    }
}
