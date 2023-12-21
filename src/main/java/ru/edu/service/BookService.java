package ru.edu.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.edu.repository.BookDetails;
import ru.edu.repository.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<BookDetails> getBookListing() {
        return bookRepository.getBooksListing();
    }

}
