public class MathOperation {
    public static void main(String[] args) throws NumberFormatException, ArithmeticException {
        if (args.length < 5) {
            System.out.println("Enter 5 integers in command line. ");
        } else {
            int arr[] = new int[5];
            try {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                }
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                System.out.println("sum: " + sum);
                System.out.println("average: " + (float) sum / arr.length);
            } catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
    }
}