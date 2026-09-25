package kuis;

public class Main {
    public static void main(String[] args) {
        
        Generator gnt = new Generator(5000, 110);
        Roket rkt = new Roket("Jet", 9000);
        SpaceShuttle ss = new SpaceShuttle("Apollo-99", 3500, gnt, rkt);

        System.out.println("Kode Shuttle: " + ss.getKode());
        System.out.println("Tipe Roket: " + ss.getRoketUtama().getTipe());
        System.out.println("Voltase Generator : " + ss.getGeneratorUtama().getVoltase());
    }
}
