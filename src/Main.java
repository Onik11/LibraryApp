import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MyException {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Remarque", "The Arch of Triumph",Status.CHECKED));
        books.add(new Book("Remarque", "All quiet on the western front",Status.CHECKED));
        books.add(new Book("Zamyatin", "We",Status.CHECKED));
        books.add(new Book("William Gibson", "Neuromancer",Status.CHECKED));
        books.add(new Book("Arkady Strugatsky", "Hard to be a God",Status.CHECKED));
        books.add(new Book("Hakob Dyumejyan,","The art of exceptions",Status.CHECKED));
        Library library= new Library();
        library.setBooks(books);

        User user= new User("Onik");

        user.getBook("Remarque", "The Arch of Triumph",Status.CHECKED,library);

        System.out.println(user.getUserBooks());
        System.out.println(library.getBooks());
        System.out.println(books.size());
        user.returnBook("Remarque", "The Arch of Triumph",Status.CHECKED_OUT,library);
        System.out.println(library.getBooks());
        System.out.println(books.size());
    }
}
