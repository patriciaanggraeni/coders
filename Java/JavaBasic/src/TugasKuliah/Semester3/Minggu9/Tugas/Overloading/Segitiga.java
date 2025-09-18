package TugasKuliah.Semester3.Minggu9.Tugas.Overloading;

public class Segitiga {

    private int sudut;

    public int totalSudut(int sudutA) {
        return this.sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return this.sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sudutA, int sudutB, int sudutC) {
        return sudutA + sudutB + sudutC;
    }

    public double keliling(int sudutA, int sudutB) {
        return Math.sqrt(Math.pow(sudutA,2) + Math.pow(sudutB,2));
    }
}
