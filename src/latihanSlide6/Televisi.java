package latihanSlide6;
public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi(){}
    public void switchChannel(int newChannel){
        this.channelAktif = newChannel;
    }

    public int getActiveChannel(){
        return channelAktif;
    }
}
