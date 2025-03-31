package fis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public static void main(String[] args) {
        BookStoreSingleton bookStore = BookStoreSingleton.getBookStore(new ArrayList<>());
        Book b = new Book();
        b.setAuthor("JAVA");
        b.setTitle("JAVA");
        b.setPrice(100);
        save(b,bookStore);

        Book b1 = new Book();
        b.setAuthor("Sailendra");
        b.setTitle("JAVA");
        b.setPrice(200);
        save(b1,bookStore);
        load("JAVA",bookStore);

        bookStore.clone();
    }

    public static void save(Book book,BookStoreSingleton bookStore){
        bookStore.getBooks().add(book);
    }

    public static void load(String title,BookStoreSingleton bookStore){
        List<Book> collect = bookStore.getBooks().stream().filter(b -> title.equals(b.getTitle())).collect(Collectors.toList());
        collect.stream().forEach(b-> System.out.println(b));
    }
}
