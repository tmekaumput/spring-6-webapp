package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;

/**
 * @Author tmekaumput
 * @Date 30/3/24 7:40 pm
 */
public interface AuthorService {

    public Iterable<Author> findAll();
}
