package edu.mum.cs.cs425.demowebapps.elibrary.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	@GetMapping(value= {"/","/elibrary","/elibrary/home"})
	public String displayHomePage() {
		return "home/index";
	}
	

	@GetMapping(value= {"/elibrary/book/list","/elibrary/book","/elibrary/book/list"})
	public String displayBooksPage() {
		return "book/list";
	}
}
