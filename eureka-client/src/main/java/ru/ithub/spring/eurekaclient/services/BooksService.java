package ru.ithub.spring.eurekaclient.services;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import ru.ithub.spring.eurekaclient.model.Books;
import ru.ithub.spring.eurekaclient.repository.BooksRepository;

import java.util.List;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @CircuitBreaker(name = "booksService", fallbackMethod = "fallbackGetBooks")
    public List<Books> getBooks() {
        throw new RuntimeException("Failed to fetch books");
    }
    public List<Books> fallbackGetBooks(Throwable throwable) {
        return List.of(new Books("Default Book"));
    }
}