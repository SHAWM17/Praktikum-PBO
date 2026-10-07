package latihanSlide6;

public class TestTelevisi {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("Samsong", 100);
        System.out.println("Channel aktif: " + tv.getActiveChannel());
        tv.switchChannel(20);
        System.out.println("Channel aktif sekarang: " + tv.getActiveChannel());
        tv.changeDisplayMode("HDMI");
        tv.playDVD();
        tv.insertDVD("The Matrix");
        tv.playDVD();
    }
}
