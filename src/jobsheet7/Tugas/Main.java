package jobsheet7.Tugas;

public class Main {
    public static void main(String[] args) {
        Manusia m;
        m = new Dosen();
        m.bernafas();
        m.makan();

        System.out.println();

        m = new Mahasiswa();
        m.bernafas();
        m.makan();
    }
}
