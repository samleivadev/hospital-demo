package hospital;

public class Doctor {
    private String employeeID;
    private String employeeName;
    private String speciality;

    public Doctor(String employeeID, String employeeName, String speciality) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.speciality = speciality;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 90000;
    }
}
