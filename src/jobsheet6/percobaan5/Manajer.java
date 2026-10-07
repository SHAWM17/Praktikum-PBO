package jobsheet6.percobaan5;

public class Manajer extends Karyawan {
    public int tunjangan;
    public Manajer(){
    }

    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       ="+tunjangan);
        System.out.println("Total Gaji       ="+(super.gaji+tunjangan));
    }
}
