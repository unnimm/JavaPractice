package chapter7;

public class Book {
    private String bookName;
    private String author;

    //디폴트 생성자
    public Book() {
    }

    ;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    // get 메서드를 통해 private bookName에 접근
    public String getBookName() {
        return bookName;
    }

    // set 메서드를 통해 private bookName 변경
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(bookName + ',' + author);
    }
}