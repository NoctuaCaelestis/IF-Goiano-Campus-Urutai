
public class Loans {

    private int Loan_Date;
    private int Loan_Time;
    Books book = new Books();
    Users user = new Users();

    public void returnBook() {
        book.setLoan(true);
        System.out.println("Livro devolvido!");
    }
}
