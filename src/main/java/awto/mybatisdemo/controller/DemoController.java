package awto.mybatisdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import awto.mybatisdemo.pojo.User;
import awto.mybatisdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/demo")
@Slf4j
public class DemoController {

	@Autowired
	private UserService userService;

	@PostMapping("/create-user")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		userService.createUser(user);
		return ResponseEntity.ok("ok");
	}

	@PutMapping("/update-user")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return ResponseEntity.ok("ok");
	}

	@GetMapping("/list-users")
	public ResponseEntity<List<User>> listUsers() {
		List<User> listOfUsers = userService.listUsers();
		return ResponseEntity.ok(listOfUsers);
	}

}
