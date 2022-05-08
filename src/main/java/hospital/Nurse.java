package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{

    private int numberOfPatients;

    public Nurse(String employeeID, String employeeName, int numberOfPatients) {
        super(employeeID, employeeName);
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    @Override
    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    @Override
    public int calculatePay() {
        return 80000;
    }
}
