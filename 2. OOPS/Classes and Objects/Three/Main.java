package Three;

public class Main {
    public static void main(String[] args) {
        Patient pat = new Patient("Rahul Kumar", 100, 60);
        System.out.println("BMI is: " + pat.computeBMI());
    }
}
