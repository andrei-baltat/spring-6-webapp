package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.AuthorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthorController {

    private final AuthorServiceImpl authorService;

    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public String getAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
