package com.zhou.es.repository;

import com.zhou.es.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Book,Integer> {

    List<Book> findByBookNameLike(String bookName);

}
