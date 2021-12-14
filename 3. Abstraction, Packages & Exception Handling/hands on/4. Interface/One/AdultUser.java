public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (this.age > 12)
            System.out.println("You have successfully registered under Adult Account.");
        else
            System.out.println("Sorry, Age must be less than 12 to register as a adult.");

    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days.");
        } else {
            System.out.println("Oops, you are only allowed to take only adult Fiction books.");
        }
    }

}
