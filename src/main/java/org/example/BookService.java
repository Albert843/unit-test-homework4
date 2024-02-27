package org.example;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(int id) {
        return bookRepository.getBookById(id);
    }
}
