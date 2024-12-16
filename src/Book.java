
public class Book {
    String title; //название книги
    String author; //автор
    int year; //год издания
    boolean isAvailable = true; //доступна ли книга для выдачи, изначально true

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Методы
    void borrowBook() {
        isAvailable = false;
    }

    void returnBook() {
        isAvailable = true;

    }
    void displayInfo() {
        System.out.println(
                "Author:" + author + "\n"
                + "Title: " + title + "\n"
                + "Year: " + year + "\n"
                + "Is it available:" + isAvailable + "\n"
        );
    }


}

