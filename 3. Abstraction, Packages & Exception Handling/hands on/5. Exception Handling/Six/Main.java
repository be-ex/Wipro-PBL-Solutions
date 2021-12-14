import java.util.*;

public class Main {
    public static void main(String[] args)
            throws NegativeValueException, ValueOutOfRangeException, ArithmeticException {
        Scanner scan = new Scanner(System.in);

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter the name of the student: ");
                String name = scan.next();
                System.out.println("Enter the marks of first subject: ");
                int sub1 = scan.nextInt();
                System.out.println("Enter the marks of second subject: ");
                int sub2 = scan.nextInt();
                System.out.println("Enter the marks of third subject: ");
                int sub3 = scan.nextInt();
                if (sub1 < 0 || sub2 < 0 || sub3 < 0) {
                    throw new NegativeValueException();
                } else if (sub1 > 100 || sub2 > 100 || sub3 > 100) {
                    throw new ValueOutOfRangeException();
                } else {
                    int sum = sub1 + sub2 + sub3;
                    System.out.println("Total marks is: " + sum);
                    System.out.println("Average marks is: " + (float) sum / 3);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
