package hospital;

public class Surgeon extends Doctor{
    private boolean isOpeating;


    public Surgeon(String employeeID, String employeeName, String speciality, boolean isOperating) {
        super(employeeID, employeeName, speciality);
        this.isOpeating = isOperating;
    }

    @Override
    public int calculatePay() {
        return 100000;
    }
}
