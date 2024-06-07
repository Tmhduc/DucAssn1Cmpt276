package cmpt276.sfu.ducassn1.controllers;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cmpt276.sfu.ducassn1.models.User;


@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllUsers(Model model) {
        System.out.println("Getting all users");
        // TODO: get all users from database
        List<User> users = new ArrayList<>();
        users.add(new User("duc", "1234", 25));

        model.addAttribute("us", users);
        return "users/showAll";
    }
    
}
