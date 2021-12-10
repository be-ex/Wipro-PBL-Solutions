import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] stars = str.split(".[\\*]+.");
        System.out.println(stars[0].concat(stars[1]));

    }
}
