import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.substring(1, input.length() - 1);
        System.out.println(input);

    }
}
