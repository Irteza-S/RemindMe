package remindme.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import remindme.model.user.User;

@Entity
public class Contract {
	@Id
	@GeneratedValue
	public int id;
	
	@OneToOne(fetch = FetchType.LAZY)
	public Company company;
	
	@ManyToOne(fetch = FetchType.LAZY)
	public User user;
	public String login;
	public String email;
	public String comment;
	public LocalDateTime startDate;
	public LocalDateTime endDate;
}
