import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first string:");
        String first = scan.nextLine();
        System.out.println("please enter second string:");
        String second = scan.nextLine();
        if (first.length() > second.length()) {
            System.out.println(second + first + second);
        } else {
            System.out.println(first + second + first);
        }

    }
}
