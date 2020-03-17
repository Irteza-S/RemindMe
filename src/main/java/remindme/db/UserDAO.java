package remindme.db;

import org.springframework.stereotype.Repository;

import remindme.model.user.*;

@Repository
public class UserDAO extends DAO<User> {
	public UserDAO() {
        super();

        setObj(User.class);
    }
}
