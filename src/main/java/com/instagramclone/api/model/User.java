package com.instagramclone.api.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;

    private String lastName;

    private String instagramName;

    private String instagramBio;

    private String password;

    private LocalDate dateOfBirth;

    private String email;

    private String phoneNumber;

    private boolean isBlueTicked;

    public User(String firstName, String lastName, String instagramName, String instagramBio, String password, LocalDate dateOfBirth, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.instagramName = instagramName;
        this.instagramBio = instagramBio;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getInstagramName() {
		return instagramName;
	}

	public void setInstagramName(String instagramName) {
		this.instagramName = instagramName;
	}

	public String getInstagramBio() {
		return instagramBio;
	}

	public void setInstagramBio(String instagramBio) {
		this.instagramBio = instagramBio;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isBlueTicked() {
		return isBlueTicked;
	}

	public void setBlueTicked(boolean isBlueTicked) {
		this.isBlueTicked = isBlueTicked;
	}

    public User() {
		
	}
    
    
    
}
