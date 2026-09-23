package jobsheet3.tugas;

public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private int kapasitasMaksimal;
    private int beratMuatanSaatIni = 0;

    public Kontainer(String resi, String pemilik, int kapasitas){
        nomorResi = resi;
        namaPemilik = pemilik;
        kapasitasMaksimal = kapasitas;
    }

    public int getKapasitasMaksimal(){
        return kapasitasMaksimal;
    }

    public String getNamaPemilik(){
        return namaPemilik;
    }

    public void tambahMuatan(int tambah){
        beratMuatanSaatIni += tambah;
    }

    public void turunkanMuatan(int turun){
        if (turun <= (50 * beratMuatanSaatIni / 100)){
            beratMuatanSaatIni -= turun;
        } else {
            System.out.println("Berat muatan yang turun maksimal 50%");
        }
    }

    public int getBeratMuatanSaatIni(){
        return beratMuatanSaatIni;
    }
}
