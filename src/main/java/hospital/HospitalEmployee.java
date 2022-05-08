package hospital;

public abstract class HospitalEmployee {
    protected String employeeID;
    protected String employeeName;

    public HospitalEmployee(String employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public abstract int calculatePay();
}
