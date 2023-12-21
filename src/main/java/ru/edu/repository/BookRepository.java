package ru.edu.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.edu.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("select b from Book b join fetch b.category where b.isActive = true")
    List<BookDetails> getBooksListing();

    @Query("select b from Book b join fetch b.category c where b.isActive = true and c.name = :category")
    List<BookDetails> getBooksInCategory(@Param("category") String category);

}
