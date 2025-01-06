package local.mon.projet.demo.controller;

import local.mon.projet.demo.entity.Username;
import local.mon.projet.demo.repository.UsernameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsernameController {

    @Autowired
    private UsernameRepository usernameRepository;

    @GetMapping("/")
    public String getUsernames(Model model) {
        List<Username> usernames = usernameRepository.findAll();
        model.addAttribute("usernames", usernames);
        return "index";
    }
}
