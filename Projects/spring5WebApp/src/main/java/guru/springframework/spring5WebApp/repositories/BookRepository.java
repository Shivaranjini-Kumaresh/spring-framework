package guru.springframework.spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5WebApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
