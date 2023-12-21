package ru.edu.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.edu.repository.BookDetails;
import ru.edu.service.CategoryService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService service;

    @GetMapping("/{category}")
    public List<BookDetails> getBookListing(@PathVariable String category) {
        return service.getBooksInCategory(category);
    }
}
