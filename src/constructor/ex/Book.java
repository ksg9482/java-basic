package constructor.ex;

public class Book {
    String title;
    String author;
    int page;

    Book() { //생성자에 매개변수 없을 때 기본값 할당.
        this("", "", 0);
        System.out.println(this.title + this.author + this.page);
    }
    Book(String title, String author) {
        this(title, author, 0);
        System.out.println(this.title + this.author + this.page);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
        System.out.println(this.title + this.author + this.page);
    }
}
