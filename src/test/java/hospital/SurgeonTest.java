package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {
    Surgeon underTest = new Surgeon("1", "name", "speciality", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldHealthLevelIncreaseFrom10to20whenCaringPatient(){
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelWhenWithdrawalBloodFrom20to15() {
        underTest.drawBlood(sickPatient);
        int bloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, bloodLevel);
    }

    @Test
    public void shouldExpectedASalaryOf100K(){
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);
    }

}
