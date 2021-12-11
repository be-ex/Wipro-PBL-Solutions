package One;

public class KotMBank extends GeneralBank {

    private double savingInterestRate = 6;
    private double fixedInterestRate = 9;

    @Override
    public double getFixedDepositInterestRate() {
        return fixedInterestRate;
    }

    @Override
    public double getSavingInterestRate() {
        return savingInterestRate;
    }
}
