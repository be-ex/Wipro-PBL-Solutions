import java.util.*;

public class Four {
    public static void main(String[] args) {
        System.out.println("Please enter a string");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int half = str.length() / 2;
        if (str.length() % 2 == 0) {
            for (int i = 0; i < half; i++) {
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.println("null");
        }

    }
}
