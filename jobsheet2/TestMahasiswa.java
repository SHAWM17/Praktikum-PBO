package jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {
        // object1
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia no 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        // object2
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 202;
        mhs2.nama = "Agung";
        mhs2.alamat = "Jl. Vinolia no 4B";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();
        // object3
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 303;
        mhs3.nama = "Jaya";
        mhs3.alamat = "Jl. Kembang Turi no 17";
        mhs3.kelas = "3H";
        mhs3.tampilBiodata();
    }
}
