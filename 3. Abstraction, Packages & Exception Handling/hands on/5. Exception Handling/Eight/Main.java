import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeNotValidException {
        try {
            if (args.length < 2) {
                System.out.println("Please enter name and age.");
            } else {
                String name = args[0];
                int age = Integer.parseInt(args[1]);
                if (age < 18 || age > 60) {
                    throw new AgeNotValidException();
                } else {
                    System.out.println(name + " is " + age + " year old.");
                }
            }

        } catch (AgeNotValidException e) {
            System.out.println(e);
        }
    }
}
