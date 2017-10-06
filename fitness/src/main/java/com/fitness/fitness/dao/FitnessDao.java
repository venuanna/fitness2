package com.fitness.fitness.dao;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.fitness.fitness.model.Event;
import com.fitness.fitness.model.User;
import com.fitness.fitness.model.UserActivity;

public class FitnessDao {
	private static final FitnessDao instance = new FitnessDao();
	private FitnessDao() {
		
	}
	public static FitnessDao getInstance() {
		return instance;
	}
	
	private Map<String, User> userMap = new ConcurrentHashMap<String, User>();
	private Map<String, Event> eventMap = new ConcurrentHashMap<String, Event>();
	private Map<Date, UserActivity> dateUserActivityMap = new ConcurrentHashMap<Date, UserActivity>();
	
	public Map<String, User> getUserMap() {
		return userMap;
	}
	public void setUserMap(Map<String, User> userMap) {
		this.userMap = userMap;
	}
	public Map<String, Event> getEventMap() {
		return eventMap;
	}
	public void setEventMap(Map<String, Event> eventMap) {
		this.eventMap = eventMap;
	}
	public Map<Date, UserActivity> getDateUserActivityMap() {
		return dateUserActivityMap;
	}
	public void setDateUserActivityMap(Map<Date, UserActivity> dateUserActivityMap) {
		this.dateUserActivityMap = dateUserActivityMap;
	}
	
	
	
	
	
	
	
}
