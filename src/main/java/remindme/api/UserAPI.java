package remindme.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import remindme.model.user.User;
import remindme.services.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserAPI {
	
	@Autowired
	private UserService userService;

	@GetMapping("/all")
	public ResponseEntity<List<User>> getAll() {
		List<User> tmpList = this.userService.getAll();
		return ResponseEntity.ok(tmpList);
	}
	
	@GetMapping("/id")
	public ResponseEntity<User> getId() {
		User user = this.userService.get(1);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/test")
	public ResponseEntity<Object> list() {
		return ResponseEntity.ok().body("HELLO");
	}
}
