public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        LibraryUser kid = new KidUser(11, "Kids");
        LibraryUser adult = new AdultUser(10, "fiction");

        
        kid.registerAccount();
        kid.requestBook();

        adult.registerAccount();
        adult.requestBook();

    }
}
