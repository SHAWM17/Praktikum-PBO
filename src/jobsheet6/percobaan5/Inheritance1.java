package jobsheet6.percobaan5;

public class Inheritance1 {
    public static void main(String[] args) {
        Manajer M = new Manajer();
        M.nama = "Vivin";
        M.alamat = "Jl. Vinolia";
        M.umur= 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManager();

        Staff S = new Staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();
    }
}
