package hospital;

public class Patient {
    private int healthLevel;
    private int bloodLevel;

    public int getHealthLevel() {
        return healthLevel;
    }
//Default constructor for Patient object
    public Patient() {
        healthLevel = 10; //Default health level for a patient before get help
        bloodLevel = 20; //Default patient blood level
    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
       bloodLevel -= bloodDecreaseAmount;
    }
}

