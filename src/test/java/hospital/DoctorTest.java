package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoctorTest {
    Doctor underTest = new Doctor("1", "name", "speciality");
    Patient sickPatient = new Patient();

    @Test
    public  void shouldIncreasePatientHealthLevelFrom10to20WhenProvidingCare(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);

    }

    @Test
    public void shouldDecreaseBloodLevelWhenWithdrawalBloodFrom20to15(){
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);

    }

    @Test
    public void shouldExpectedASalaryOf90K(){
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }

}
