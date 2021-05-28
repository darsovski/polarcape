public class Book implements Comparable<Book>{

    String title;
    String ISBN;
    int yearCreated;
    Author author;
    Ebook ebook;
    PrintBook printBook;

    public Book(String title, String ISBN, int yearCreated,Author author,Ebook ebook, PrintBook printBook) {
        this.title = title;
        this.ISBN = ISBN;
        this.yearCreated = yearCreated;
        this.author=author;
        this.ebook = ebook;
        this.printBook = printBook;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s",title,ISBN,yearCreated,author,ebook);
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public Author getAuthor() {
        return author;
    }

    public Ebook getEbook() {
        return ebook;
    }

    public PrintBook getPrintBook() {
        return printBook;
    }

    public int compareTo(Book b) {
        if (Integer.compare(yearCreated,b.yearCreated) != 0) {
            return Integer.compare(yearCreated,b.yearCreated);
        }
        return 0;
    }

}
