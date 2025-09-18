package TugasKuliah.Semester3.Minggu12.Praktikum.Percobaan4;

public class InternshipEmployee extends Employee {

    private int length;

    public InternshipEmployee(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as intership employee for " + length + " month/s\n";
        return info;
    }
}