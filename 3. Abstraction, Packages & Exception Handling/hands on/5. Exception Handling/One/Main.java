import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try {
            int num = Integer.parseInt(scan.nextLine());
            System.out.println("The square value is: " + num * num);
            System.out.println("Work has been done successfully.");
        } catch (Exception e) {
            System.out.println("Entered input is not a valid format for an integer.");

        }
    }
}