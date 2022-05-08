package hospital;

public class Nurse {
    private String employeeID;
    private String name;
    private int numberOfPatients;

    public Nurse(String employeeID, String name, int numberOfPatients) {
        this.employeeID = employeeID;
        this.name = name;
        this.numberOfPatients = numberOfPatients;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 80000;
    }
}
