public class Book {
    String bookName;
    Author author;
    int yearPublic;



    public Book(String bookName, Author author, int yearPublic) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublic = yearPublic;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearPublic() {
        return yearPublic;
    }
    public void setYearPublic( int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
