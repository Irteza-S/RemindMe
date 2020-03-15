package remindme.model;

import java.time.LocalDateTime;

import remindme.model.user.User;

public class Contract {
	public int id;
	public Company company;
	public User user;
	public String login;
	public String email;
	public String comment;
	public LocalDateTime startDate;
	public LocalDateTime endDate;
}
