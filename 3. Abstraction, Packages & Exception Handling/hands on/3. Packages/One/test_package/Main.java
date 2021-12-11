package One.test_package;

public class Main {
    public static void main(String[] args) {

        Foundation foundation = new Foundation();
        System.out.println("'Id' is not accessible, it gives compilation error.");
        System.out.println("First name " + foundation.firstName + " is accessible.");
        System.out.println("Last name " + foundation.lastName + " is accessible.");
        System.out.println("Address " + foundation.address + " is accessible.");
    }
}
