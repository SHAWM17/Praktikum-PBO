package jobsheet2;

public class TokoGame {
    public static void main(String[] args) {
        SewaGame member1 = new SewaGame();
        member1.id=112;
        member1.namaMember="Saumi";
        member1.namaGame="Tekken6";
        member1.lamaSewa=5;
        member1.harga=20000;

        member1.dataPeminjaman();
    }
}
