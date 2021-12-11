package One;

public class ICICIBank extends GeneralBank {

    private double savingInterestRate = 4;
    private double fixedInterestRate = 8.5;

    @Override
    public double getFixedDepositInterestRate() {
        return fixedInterestRate;
    }

    @Override
    public double getSavingInterestRate() {
        return savingInterestRate;
    }

}
