public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    // Method to get the cash value of the RewardValue
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get how many miles the RewardValue is worth
    public double getMilesValue() {
        return this.milesValue;
    }
}
