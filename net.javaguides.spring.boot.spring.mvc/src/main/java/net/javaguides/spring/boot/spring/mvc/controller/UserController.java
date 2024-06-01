package net.javaguides.spring.boot.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.spring.boot.spring.mvc.model.User;
import net.javaguides.spring.boot.spring.mvc.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	public String getUser(@PathVariable("id") Long id, Model model) {
		User user = userService.findById(id);
		model.addAttribute("userDetail", user);
		return "userDetail";
	}

	@PostMapping("/user/create")
	public User addUser(@RequestBody User userObject) {
		User user = userService.addUser(userObject);
		return user;
	}
}
