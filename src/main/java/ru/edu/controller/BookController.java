package ru.edu.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.edu.repository.*;
import ru.edu.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@AllArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping
    public List<BookDetails> getBookListing() {
        return service.getBookListing();
    }

}
