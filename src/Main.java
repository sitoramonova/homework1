/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("voina i mir", "L.N. Tolstoi", 1867, true);
        Book book2 = new Book ("Tri tovarisha", "Erich Remarque", 1936, false);
        Book book3 = new Book("Kolobok", "A.N. Tolstoi");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.printAvailableBooks();
        book2.isAvailable = true;
        library.printAvailableBooks();

    }
}



