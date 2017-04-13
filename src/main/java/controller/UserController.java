package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

/**
 * Created by Odyniuk on 13/04/2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users"; // /jsp/areas.jsp
    }

    @GetMapping("/{id}")
    public String getUser(Model model, @PathVariable Integer id){
        model.addAttribute("user",userService.findById(id));
        return "user";
    }

    @GetMapping("/new")
    public String newUser() {
        return "newUser";
    }

    @PostMapping
    public String createUser(User user) {
        userService.save(user);
        return "redirect:/user";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.delete(id);
        return "redirect:/user";
    }
}