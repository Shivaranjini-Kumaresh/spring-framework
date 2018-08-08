package guru.springframework.spring5WebApp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5WebApp.model.Author;
import guru.springframework.spring5WebApp.model.Book;
import guru.springframework.spring5WebApp.repositories.AuthorRepository;
import guru.springframework.spring5WebApp.repositories.BookRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private AuthorRepository authRepo;
	
	@Autowired
	private BookRepository bookRepo;

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
		
		author.getBooks().add(book);
		book.getAuthors().add(author);
		
		authRepo.save(author);
		bookRepo.save(book);
		
		
		
	}

}
