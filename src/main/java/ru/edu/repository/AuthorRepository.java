package ru.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.edu.entity.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("select a.firstName, a.lastName from Author a join Book b where b.id = a.id")
    List<Author> getAuthorsByBookId(@Param("id") Long id);
}
