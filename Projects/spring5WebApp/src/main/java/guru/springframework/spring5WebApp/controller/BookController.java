package guru.springframework.spring5WebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5WebApp.repositories.BookRepository;

@Controller
public class BookController {

	@Autowired
	BookRepository bookRepo;
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books" , bookRepo.findAll());
		return "books";
	}
}
