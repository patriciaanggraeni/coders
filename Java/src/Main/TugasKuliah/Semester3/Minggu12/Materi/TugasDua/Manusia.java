package TugasKuliah.Semester3.Minggu12.Materi.TugasDua;

public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {

        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan televisi jadul dengan input  : " + ((TelevisiJadul) perangkat).getModelInput());
            System.out.println("Voltase televisi : " + perangkat.getVoltase());
        } else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi nodern dengan input : " + ((TelevisiModern) perangkat).getNodeInput());
            System.out.println("Voltase televisi : " + perangkat.getVoltase());
        }
    }
}