package latihanSlide6;

public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    public TelevisiModern (String mrk, int channelCount){
        merek = mrk;
        jumlahChannel = channelCount;
    }

    public void changeDisplayMode (String mode){
        this.displayMode = mode;
    }

    public void playDVD(){
        if (dvd == null){
            System.out.println("Sedang memainkan DVD: kosong");
        } else {
            System.out.println("Sedang memainkan DVD: " + dvd);
        }
    }

    public void insertDVD(String dvdTitle){
        this.dvd = dvdTitle;
    }
}
