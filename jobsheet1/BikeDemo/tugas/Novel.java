package tugas;

public class Novel {
    public String judul;
    public String penulis;
    public String penerbit;
    public int tahunTerbit;

    public void setDetail(String judul, String penulis, String penerbit, int tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public void bacaRingkasan() {
        System.out.println("Membaca ringkasan novel \"" + judul + "\" karya " + penulis + ".");
    }

    public void cetakInformasi() {
        System.out.println("=== Informasi Novel ===");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Penerbit     : " + penerbit);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println();
    }
}
