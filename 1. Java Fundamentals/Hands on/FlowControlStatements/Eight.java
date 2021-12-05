import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        System.out.println("Enter the color code: ");
        Scanner scan= new Scanner(System.in);
        String str= scan.next();
        char code = str.charAt(0);
        switch (code) {
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");
                break;
        }
    }
}
