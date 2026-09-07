package jobsheet2;

public class SewaGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;

    public void dataPeminjaman() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Harga Sewa  : Rp" + harga + "/hari");
        System.out.println("Total Biaya : Rp" + tampilBiayaPeminjaman(lamaSewa, harga));
    }

    public int tampilBiayaPeminjaman(int lamaSewa, int harga) {
        return lamaSewa * harga;
    }
}
