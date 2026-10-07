package jobsheet6.percobaan6;

public class StaffTetap extends Staff  {
    public String golongan;
    public int asusransi;

    public StaffTetap(){
    }

    public StaffTetap(String nama, String alamat,String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asusransi){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asusransi = asusransi;
    }

    public void tampilStaffTetap(){
        System.out.println("=========================Data Staff Tetap=========================");
        super.tampilDataStaff();
        System.out.println("Golongan        ="+golongan);
        System.out.println("Jumlah Asusransi       ="+asusransi);
        System.out.println("Gaji Bersih       ="+(gaji+lembur-potongan+asusransi));
    }
}
