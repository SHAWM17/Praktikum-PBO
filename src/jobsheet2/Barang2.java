package jobsheet2;

public class Barang2 {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual(){
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    void tampilData(){
        System.out.println(kode);
        System.out.println(namaBarang);
        System.out.println("RP. " + hargaDasar);
        System.out.println(diskon + "%");
        System.out.println("RP. " + hitungHargaJual());
    }
}
