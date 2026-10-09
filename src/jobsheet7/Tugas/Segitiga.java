package jobsheet7.Tugas;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }

    public double keliling(double sisiA, double sisiB){
        double sisiC = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
        return sisiA + sisiB + sisiC;        
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut segitiga dengan 1 sudut 60 derajat: " + segitiga.totalSudut(60));
        System.out.println("Total sudut segitiga dengan 2 sudut 60 dan 70 derajat: " + segitiga.totalSudut(60, 70));
        System.out.println("Keliling segitiga dengan sisi 3, 4, dan 5: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling segitiga dengan sisi 3.0 dan 4.0: " + segitiga.keliling(3.0, 4.0));
    }
}
