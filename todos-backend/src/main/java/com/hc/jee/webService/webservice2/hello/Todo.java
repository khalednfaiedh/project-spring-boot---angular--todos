package com.hc.jee.webService.webservice2.hello;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
@Entity
public class Todo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String username;
	private String descrption;
	
	@Column(name = "ttdate")
	private  Date targetDate;
	private boolean done;
	
	public Todo(long id, String username, String descrption, Date targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.descrption = descrption;
		
		this.targetDate = targetDate;
		this.done = done;
	}
	
	

	public Todo() {
	
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", descrption=" + descrption + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}
	
	
	
	

}
