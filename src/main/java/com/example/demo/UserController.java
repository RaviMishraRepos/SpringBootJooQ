package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tej.JooQDemo.jooq.sample.model.tables.records.UserRecord;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<UserRecord> getUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public UserRecord getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping
	public void addUser(@RequestBody UserDTO user) {
		System.out.println("Called");
		userService.addUser(user);
	}

	@PutMapping("/{id}")
	public void updateUser(@PathVariable int id, @RequestBody UserDTO user) {
		userService.updateUser(id, user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
}