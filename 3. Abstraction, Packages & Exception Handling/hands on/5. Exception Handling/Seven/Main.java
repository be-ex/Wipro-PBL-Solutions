public class Main {
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        try {
            user.registerUser("Tanisha", "India");
            user.registerUser("Yunus", "Pakistan");
        } catch (InvalidCountryException ice) {
            System.out.println(ice);
        }
    }
}
