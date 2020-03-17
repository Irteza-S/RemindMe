package remindme.db;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import remindme.model.user.User;

@Component
public class DatabaseFillerOnStartup implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	UserDAO userDAO;
	
    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
		userDAO.save(new User("Irteza", "SHeikh"));
		userDAO.save(new User("SDSD", "OKKQSD"));
    }
}