package com.bank.app;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
 
     
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;
    
    @Column(name="date_of_birth",nullable = false, length = 45)
    private String dateofbirth;
    
    @Column(name="gender",nullable = false, length = 45)
    private String gender;
    
    @Column(name="age",nullable = false, length = 45)
    private int age;
    
    @Column(name="address",nullable = false, length = 200)
    private String address;
    
    @Column(nullable = false, unique = true, length = 45)
    private String email;
     
    @Column(name="accounttype" ,nullable = false, length = 64)
    private String accounttype;

    
    
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}


    
    
    
}