package HW2;
import java.util.List;
//5b

public class Course {
    private int code;
    private List<Book> books;
    public Course(int code, List<Book> books) {
        this.code = code;
        this.books = books;
    }

}

class Book {
    
    private String name;
    private String author;
    private Course course;
    
    public Book() {
    }
}
