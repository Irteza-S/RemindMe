package remindme.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import remindme.db.UserDAO;
import remindme.model.user.User;

@Component
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	public void save(User user) {
		userDAO.save(user);
	}

   	public User get(long id) {
   		return userDAO.findOne(id);
   	}
   	
   	public List<User> getAll() {
   		return userDAO.findAll();
   	}

}
