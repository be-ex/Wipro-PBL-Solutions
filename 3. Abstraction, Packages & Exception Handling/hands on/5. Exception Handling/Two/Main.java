import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = scan.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the index of array element you want to access");
        int pos = scan.nextInt();
        try {
            System.out.println("The array element at index " + pos + " is: " + arr[pos]);
            System.out.println("Array element successfully accessed.");
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println(exp.getClass());
        }

    }
}