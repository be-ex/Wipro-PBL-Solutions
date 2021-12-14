import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        try {
            System.out.println("The quotient is " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Inside finally block.");
        }
    }
}