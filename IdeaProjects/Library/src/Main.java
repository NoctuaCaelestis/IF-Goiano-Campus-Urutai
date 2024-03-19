public class Main {
    public static void main (String [] args) {
        Loans loans = new Loans();
        Users user = new Users("Ferranando", "MALE", "666", 32);
        loans.book.openBook();
        loans.user.readBook();
        loans.book.closeBook();
        loans.returnBook();
    }
}
