package TugasKuliah.Semester3.Minggu12.Praktikum.Percobaan4;

public class Tester4 {
    public static void main(String[] args) {

        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-2");
        ow.play(eBill);
        System.out.println("----------------------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.play(pEmp);
        System.out.println("----------------------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("----------------------------------------------");
        ow.showMyEmployee(iEmp);

        // ow.play(iEmp);
    }
}
