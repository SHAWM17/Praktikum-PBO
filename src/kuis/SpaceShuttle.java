package kuis;

public class SpaceShuttle {
    private String kode;
    private int berat;
    private Generator generatorUtama;
    private Roket roketUtama;

    public SpaceShuttle(String kd, int brt, Generator gnt, Roket rkt) {
        this.kode = kd;
        this.berat = brt;
        this.generatorUtama = gnt;
        this.roketUtama = rkt;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setGeneratorUtama(Generator generatorUtama) {
        this.generatorUtama = generatorUtama;
    }

    public void setRoketUtama(Roket roketUtama) {
        this.roketUtama = roketUtama;
    }

    public String getKode() {
        return kode;
    }

    public int getBerat() {
        return berat;
    }

    public Generator getGeneratorUtama() {
        return generatorUtama;
    }

    public Roket getRoketUtama() {
        return roketUtama;
    }
}
