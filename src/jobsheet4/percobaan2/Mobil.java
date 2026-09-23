
public class Mobil {
    private String merk;
    private int biaya;
    
    public Mobil(){
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(int biaya){
        return merk;
    }

    public void setBiaya(int biaya){
        this.biaya = biaya;
    }

    public int getBiaya(){
        return biaya;
    }

    public int hitungLayananMobil(int hari){
        return biaya * hari;
    }
}
