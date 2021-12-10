public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Chetan Bhagat", "chetan@gmail.com", 'M');
        Author author2 = new Author("Maneka Channa", "maneka@gmail.com", 'F');
        Author author3 = new Author("Prem Chand", "prem@gmail.com", 'M');
        Author author4 = new Author("George Orwell", "georgeorwell@gmail.com", 'M');
        Book book1 = new Book("The Half Girlfriend", author1, 450, 3);
        Book book2 = new Book("The New Born Legacy", author2, 350, 3);
        Book book3 = new Book("My Home", author3, 250, 3);
        Book book4 = new Book("Lesser Man", author4, 200, 3);
        System.out.println(
                book1.toString() + "\n" + book2.toString() + "\n" + book3.toString() + "\n" + book4.toString());
    }
}
