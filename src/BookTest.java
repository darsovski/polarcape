import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        String title= fillCollection(bookCollection);
    }

    static String fillCollection(BookCollection bk) {
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String [] parts = line.split(" ");
            if (parts.length < 5)
                return parts[0];
            Book book= new Book(parts[0],parts[1],Integer.parseInt(parts[2]),parts[3],parts[4],parts[5]);
            bk.addBook(book);
        }
        scanner.close();
        return "";
    }
}
