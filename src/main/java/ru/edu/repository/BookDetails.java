package ru.edu.repository;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface BookDetails {
    String getTitle();
    String getLanguage();
    List<AuthorDetails> getAuthors();
    CategoryDetails getCategory();

    interface AuthorDetails {
        @Value("#{target.firstName + ' ' + target.lastName}")
        String getName();
        //String getFirstName();
        //String getLastName();
    }

    interface CategoryDetails {
        String getName();
    }
}
