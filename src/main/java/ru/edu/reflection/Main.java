package ru.edu.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Book> bookObj = Book.class;
        System.out.println("---Class---");
        showAnnotation(bookObj);

        System.out.println("---Method---");
        Method method = bookObj.getMethod("printDetails");
        showAnnotation(method);

    }

    public static void showAnnotation(AnnotatedElement element) {
        Annotation[] annotations = element.getAnnotations();
        Arrays.stream(annotations)
                .filter(annotation -> annotation instanceof BookDetails)
                .forEach(annotation ->
                        System.out.println("author: " + ((BookDetails) annotation).author() + " age: "
                                + ((BookDetails) annotation).age()));
    }
}
