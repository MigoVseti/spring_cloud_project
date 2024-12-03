package ru.ithub.spring.eurekaclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ithub.spring.eurekaclient.model.Books;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
