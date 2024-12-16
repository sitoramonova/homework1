import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void printAvailableBooks() {
        for(var x: books) {
            if (x.isAvailable) {
                System.out.println(
                         "Author:" + x.author + "\n"
                         + "Title: " + x.title + "\n"
                         + "Year: " + x.year + "\n");
            }
        }
    }

    List<Book> findBooksByAuthor(String author) {
        List<Book> ans = new ArrayList<>();
        for(var x: books) {
            if (x.author.equals(author)) {
                ans.add(x);
            }
        }
        return ans;
    }
}
/**
 * 3.1 Поле books — массив или список книг.
 * 3.2 Метод addBook(Book book): добавляет книгу в библиотеку.
 * 3.3 Метод printAvailableBooks(): выводит все доступные книги.
 * 3.4 Метод findBooksByAuthor(String author): возвращает книги
 * автора.
 */