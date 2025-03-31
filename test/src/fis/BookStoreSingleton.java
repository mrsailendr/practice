package fis;

import java.util.List;

public class BookStoreSingleton {

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    private List<Book> books;
    private static BookStoreSingleton store = new BookStoreSingleton();
    private BookStoreSingleton(){
    }

    public static BookStoreSingleton getBookStore(List<Book> books){
        store.setBooks(books);
        return store;
    }

}
