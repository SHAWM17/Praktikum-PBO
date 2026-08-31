package tugas;

public class SepatuFutsal extends Sepatu {
    public String bahanSol;
    public String jenisLapisan;

    public void setDetailFutsal(String merk, double harga, String bahanSol, String jenisLapisan) {
        super.setSepatu(merk, harga);
        this.bahanSol = bahanSol;
        this.jenisLapisan = jenisLapisan;
    }

    public void pakaiMainFutsal() {
        System.out.println("Menggunakan sepatu futsal " + brand + " untuk mencetak gol di lapangan sintetis!");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== Informasi Sepatu Futsal ===");
        System.out.println("Merk          : " + brand);
        System.out.println("Harga         : Rp " + (long) harga);
        System.out.println("Bahan Sol     : " + bahanSol);
        System.out.println("Jenis Lapisan : " + jenisLapisan);
        System.out.println();
    }
}
