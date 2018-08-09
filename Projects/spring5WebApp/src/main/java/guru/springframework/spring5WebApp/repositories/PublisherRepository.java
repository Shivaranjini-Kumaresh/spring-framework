package guru.springframework.spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5WebApp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
