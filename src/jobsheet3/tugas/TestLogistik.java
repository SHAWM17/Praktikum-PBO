package jobsheet3.tugas;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("--- INFORMASI KONTAINER ---");
        System.out.println("Nama Pemilik Kontainer : " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal     : " + kontainerAlfa.getKapasitasMaksimal() + " kg");
        System.out.println("-----------------------------------");

        // Input dinamis 1: Tambah Muatan
        System.out.print("\nMasukkan berat muatan yang ingin ditambah (kg): ");
        int tambah1 = sc.nextInt();
        kontainerAlfa.tambahMuatan(tambah1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input dinamis 2: Tambah Muatan Lagi
        System.out.print("\nMasukkan berat muatan yang ingin ditambah lagi (kg): ");
        int tambah2 = sc.nextInt();
        kontainerAlfa.tambahMuatan(tambah2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input dinamis 3: Turunkan Muatan
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        int turun1 = sc.nextInt();
        kontainerAlfa.turunkanMuatan(turun1);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        // Input dinamis 4: Turunkan Muatan Lagi
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan lagi (kg): ");
        int turun2 = sc.nextInt();
        kontainerAlfa.turunkanMuatan(turun2);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        sc.close();
    }
}
