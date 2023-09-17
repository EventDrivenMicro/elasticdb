package com.elastic.dao.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@Document(indexName = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String description;

}
