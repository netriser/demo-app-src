package local.mon_projet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import local.mon_projet.demo.repository.UsernameRepository;

@Controller
public class UsernameController {

    private final UsernameRepository usernameRepository;

    public UsernameController(UsernameRepository usernameRepository) {
        this.usernameRepository = usernameRepository;
    }

    @GetMapping("/")
    public String getUsernames(Model model) {
        model.addAttribute("usernames", usernameRepository.findAll());
        return "index"; // Correspond au fichier Thymeleaf index.html
    }
}
