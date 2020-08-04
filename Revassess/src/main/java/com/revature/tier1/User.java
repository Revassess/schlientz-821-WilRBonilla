package com.revature.tier1;

public class User {
	// private fields
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String role;
	
	// Constructors
	public User() {
		super();
	}


	public User(int id, String firstname, String lastname, String username, String password, String role) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	// Getters/setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstName;
	}


	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}


	public String getLastname() {
		return lastName;
	}


	public void setLastname(String lastname) {
		this.lastName = lastname;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
}
