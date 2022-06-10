package org.generation.PersonalPet.Usuarios;

public class usuarios {
	
	private String name;
	private String user_name;
	private String email;
	private String password;
	private String gender; 
	private String country;
	private String pet;
	
	
	
	//Constructores
	public usuarios(String name, String user_name, String email, String password, String gender, String country, String pet) {
		super();
		this.name = name;
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.country = country;
		this.pet = pet;
		
	//Getters and Setters	
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUser_name() {
		return user_name;
	}



	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getpet() {
		return pet;
	}



	public void setpet(String pet) {
		this.pet = pet;
	}



	@Override
	public String toString() {
		return "usuarios [name=" + name + ", user_name=" + user_name + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", country=" + country + ", pet=" + pet + "]";
	}



	
	
	

}

