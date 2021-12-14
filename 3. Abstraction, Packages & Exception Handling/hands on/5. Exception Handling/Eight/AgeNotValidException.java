public class AgeNotValidException extends Exception {
    public AgeNotValidException() {
        System.out.println("Invalid age! Age must be between 18 and 60.");
    }
}