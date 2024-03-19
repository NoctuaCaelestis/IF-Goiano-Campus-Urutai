public class Books {
    private String title;
    private String authors;
    private String area;
    private String publisher;
    private int year;
    private String edition;
    private int page_num;
    private boolean loan;

    public Books() {

    }

    public Books (String title, String authors, String area, String publisher, int year, String edition,
                  int page_num, boolean loan) {
        this.title = title;
        this.authors = authors;
        this.area = area;
        this.publisher = publisher;
        this.year = year;
        this.edition = edition;
        this.page_num = page_num;
        this.loan = false;
    }

    public void setLoan (boolean loan) {this.loan = loan;}
    public boolean isLoan () {return loan;}
    public String getTitle() {return title;}
    public String getAuthors() {return authors;}
    public String getArea() {return area;}
    public String getPublisher() {return publisher;}
    public int getYear() {return year;}
    public String getEdition() {return edition;}
    public int getPage_num() {return page_num;}

    public void openBook ()  {System.out.println("Livro aberto!");}
    public void closeBook() {System.out.println ("Livro fechado!");}

}
