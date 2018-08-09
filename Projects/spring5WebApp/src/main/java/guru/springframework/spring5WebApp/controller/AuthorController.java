package guru.springframework.spring5WebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5WebApp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	@Autowired
	AuthorRepository authRepo;
	
	@RequestMapping("/authors")
	private String getAuthors(Model model) {
		model.addAttribute("authors", authRepo.findAll());
		return "authors";
	}
}
