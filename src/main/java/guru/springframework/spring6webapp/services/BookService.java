package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;


/**
* @Author tmekaumput
* @Date 30/3/24 5:47 pm
*/public interface BookService {

    public Iterable<Book> findAll();
}
