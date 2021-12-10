import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String args1 = scan.nextLine();
        System.out.println("Enter String 2:");
        String args2 = scan.nextLine();
        System.out.print(args1.toLowerCase() + args2.toLowerCase());

    }
}
