package com.fci.advanced.se.fawryservice.entities;
import com.fci.advanced.se.fawryservice.controllers.FawrySystem;

public class Transaction {
	private  int id;
	private String username;
	private String service_type;
	private double amount;
	private String state;
	
	// transaction

	public Transaction(String username,String serviceType,double amount){
		this.setUsername(username);
		this.setService_type(serviceType);
		this.setAmount(amount);
		this.setState("Completed");
		setId(FawrySystem.ids++);
	}
	
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String name) {
		this.username = name;
	}
	
	public String getService_type() {
		return service_type;
	}
		
	public void setService_type(String type) {
		this.service_type = type;
	}
	
	public void printTransaction() {
		System.out.println("User name: "+this.getUsername()+".\n");
		System.out.println("Service type: "+this.getService_type()+".");
		System.out.println("Amount: "+this.getAmount()+".");
		System.out.println("Transaction state: "+this.getState()+".");
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



		
}
