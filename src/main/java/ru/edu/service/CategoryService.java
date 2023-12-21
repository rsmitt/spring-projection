package ru.edu.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.edu.repository.BookDetails;
import ru.edu.repository.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final BookRepository repository;

    public List<BookDetails> getBooksInCategory(String category) {
        return repository.getBooksInCategory(category);
    }
}
