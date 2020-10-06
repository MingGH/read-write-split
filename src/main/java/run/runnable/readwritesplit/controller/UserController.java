package run.runnable.readwritesplit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import run.runnable.readwritesplit.entity.User;
import run.runnable.readwritesplit.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Object list() {
		return userService.list();
	}
	
	@GetMapping("/add")
	public Object add() {
		User user = new User();
		user.setAge((int)(Math.random()*100));
		return userService.add(user);
	}
	
}
