package ru.edu.reflection;

@BookDetails(author = "author1", age = 1960)
public class Book {

    @BookDetails(author = "author2", age = 1977)
    public void printDetails() {
        ///....
    }
}
