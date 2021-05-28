import java.util.*;

public class BookCollection {

    List<Book> bookList;
    Map<Book,Author> authorBookMap;

    public BookCollection() {
        this.bookList= new ArrayList<>();
        this.authorBookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    /*A*/
    public String allBooks() {
        return  bookList.toString();
    }

    /*B*/
    public List<Book> allBooksByLastName(String s) {
        return  authorBookMap.values().forEach(v->v.lastname.startsWith(s));

    }

    /*V*/
    public  List<Author> allAuthorDecade() {
        Set<Integer> yearsOfBooks=new TreeSet<>();
        Set<Integer> yearsOfAuthors=new TreeSet<>();
        Set<Author> authorList = new TreeSet<>();


            for(Book book : bookList) {
                yearsOfBooks.add(book.yearCreated);
            }

            for(Author a : authorBookMap.values()) {
                String [] parts = a.dateOfBirth.split(" ");

                String year = parts[2];
                yearsOfAuthors.add(Integer.parseInt(year));
                authorList.add(a);
            }

            for(Integer  i :yearsOfAuthors) {
                int decadeStart = i - (i%10);
                int decadaEnd= decadeStart+10;

               for (Integer i : yearsOfAuthors) {
                   if(decadeStart<=i && i<=decadaEnd) {
                       System.out.println(authorList);
                   }
               }
            }
    }



    public List<Author> moreThan3Books(Map<Author,Book> authorBookMap) {
        HashMap newMap= new HashMap();
        Iterator it = authorBookMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                System.out.println(pair.getKey() + "=" + pair.getValue());
                if(newMap.containsKey(pair.getValue())) {
                    newMap.put((pair.getValue()))
                }
            }
    }

    public List<Book> getList() {
        return bookList;
    }
}
