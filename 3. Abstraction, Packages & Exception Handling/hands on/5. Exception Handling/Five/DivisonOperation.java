import java.util.Scanner;

class DivisonOperation {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the dividend number: ");
        num1 = scan.nextInt();
        System.out.println("Enter the divisor number: ");
        num2 = scan.nextInt();
        try {
            System.out.println("The result is: "+divison(num1, num2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static int divison(int num1, int num2) {
        return num1 / num2;
    }
}