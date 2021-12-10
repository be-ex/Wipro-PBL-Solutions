import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        int n = str.length();
        String repeat = str.substring(0, 2);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result.concat(repeat);
        }
        System.out.println(result);
    }
}
