package One;

public class Main {
    public static void main(String[] args) {
        ICICIBank icici = new ICICIBank(); // or GeneralBank icici=new ICICIBank();
        System.out
                .println("Fixed Deposit Interest rate of Icici Bank is: " + icici.getFixedDepositInterestRate() + "%");
        System.out
                .println("Saving Interest rate of Icici Bank is: " + icici.getSavingInterestRate() + "%");
        KotMBank kotak = new KotMBank(); // or GeneralBank kotak=new KotMBank();
        System.out.println(
                "Fixed Deposit Interest rate of Kotak Mahindra Bank is: " + kotak.getFixedDepositInterestRate() + "%");
        System.out.println(
                "Savings Interest rate of Kotak Mahindra Bank is: " + kotak.getSavingInterestRate() + "%");
    }
}
