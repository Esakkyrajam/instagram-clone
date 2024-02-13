package com.instagramclone.api.DTO;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SignUpRequest {
    @Column(nullable = false)
    @NotEmpty
    private String firstName;
    @Column(nullable = false)
    @NotEmpty
    private String lastName;
    @Column(nullable = false, unique = true)
    @NotEmpty
    private String instagramName;
    private String instagramBio;
    private String password;
    @Column(nullable = false)
    @Past
    private LocalDate dateOfBirth;
    @Column(unique = true , nullable = false)
    @Email
    @NotBlank
    private String email;
    @Column(nullable = false)
    @Pattern(regexp = "\\d{2}-\\d{10}", message = "Phone number should be in the format XX-XXXXXXXXXX")
    private String phoneNumber;
    
    
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
    
    
    
    
    
    
    
}
