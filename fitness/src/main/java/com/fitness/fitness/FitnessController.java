package com.fitness.fitness;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.fitness.model.User;

@RestController
public class FitnessController {
	
	private static final Logger logger = LoggerFactory.getLogger(FitnessController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUsers() {
		List<User> userList = new ArrayList<User>();
		User u = new User();
		u.setId("1");
		u.setName("name");
		
		User u1 = new User();
		u1.setId("2");
		u1.setName("name2");
		
		
		userList.add(u1);
		userList.add(u);
		
		return userList;
		
		
		
	}
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public List<User> createUser(User user) {
		List<User> userList = new ArrayList<User>();
		User u = new User();
		u.setId("1");
		u.setName("name");
		
		User u1 = new User();
		u1.setId("2");
		u1.setName("name2");
		
		
		userList.add(u1);
		userList.add(u);
		
		return userList;
		
		
		
	}
	
	
	
}
