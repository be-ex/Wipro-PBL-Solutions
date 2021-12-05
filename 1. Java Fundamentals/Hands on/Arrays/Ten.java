public class Ten {

    public static void main(String[] args) {
        if (args.length < 9) {
            System.out.println("Please enter 9 integer numbers");
        } else {
            int arr[][] = new int[3][3];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = Integer.parseInt(args[k]);
                    k++;
                }
            }
            int max = Integer.MIN_VALUE;
            System.out.println("The given array is :");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                    }
                }
                System.out.print("\n");
            }

            System.out.println("The biggest number in the given array is " + max);
        }
    }
}
