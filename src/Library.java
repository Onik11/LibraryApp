import java.util.ArrayList;

import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book checkOut(String author, String title,Status status) throws MyException {
        Book book = new Book(author, title, status);
        if (books.contains(book)) {
            return book;
        } else {
            throw new MyException(ErrorMessage.NOT_FOUND_BOOK);
        }
    }
    public void removeBook(Book book){
        books.remove(book);
        book.setStatus(Status.CHECKED_OUT);
    }
}
