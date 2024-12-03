package ru.ithub.spring.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ithub.spring.eurekaclient.model.Books;
import ru.ithub.spring.eurekaclient.services.BooksService;

import java.util.List;

@RestController
public class BooksController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/books")
    public List<Books> getBooks() {
        return booksService.getBooks();
    }
}