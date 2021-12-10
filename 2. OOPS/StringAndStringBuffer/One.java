import java.util.Scanner;

class One {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String temp = "";
        String input = scan.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            temp = temp.concat(String.valueOf(input.charAt(i)));
        }
        if (temp.equals(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }

}