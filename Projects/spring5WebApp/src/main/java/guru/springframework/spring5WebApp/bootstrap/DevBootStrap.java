package guru.springframework.spring5WebApp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5WebApp.model.Author;
import guru.springframework.spring5WebApp.model.Book;
import guru.springframework.spring5WebApp.model.Publisher;
import guru.springframework.spring5WebApp.repositories.AuthorRepository;
import guru.springframework.spring5WebApp.repositories.BookRepository;
import guru.springframework.spring5WebApp.repositories.PublisherRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private AuthorRepository authRepo;
	
	@Autowired
	private BookRepository bookRepo;
	
	@Autowired
	private PublisherRepository publisherRepo;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
	
	private void initData() {
		Author author = new Author();
		author.setAuthorName("tom");
		
		Book book = new Book();
		book.setBookName("HarrY Potter");
		book.setGenre("Fiction");
		
		Publisher publisher = new Publisher();
		publisher.setName("Walmart");
		publisher.setAddress("Bangalore");
		
		author.getBooks().add(book);
		book.getAuthors().add(author);
		book.setPublisher(publisher);
		
		publisherRepo.save(publisher);
		authRepo.save(author);
		bookRepo.save(book);
		
		
		
	}

}
