package com.elastic.service;

import com.elastic.dao.entity.Book;
import com.elastic.dao.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> getById(String id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public void delete(String id) {
        bookRepository.deleteById(id);
    }
}
