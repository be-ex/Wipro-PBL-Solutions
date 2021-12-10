import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Please enter a string:");
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        if (first.charAt(0) == 'x' && first.charAt(first.length() - 1) == 'x') {
            first = first.substring(1, first.length() - 1);
        } else if (first.charAt(0) == 'x') {
            first = first.substring(1);
        } else if (first.charAt(first.length() - 1) == 'x') {
            first = first.substring(0, first.length() - 1);
        }
        System.out.println(first);

    }
}
