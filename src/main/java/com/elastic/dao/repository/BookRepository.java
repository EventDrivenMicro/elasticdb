package com.elastic.dao.repository;

import com.elastic.dao.entity.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
}