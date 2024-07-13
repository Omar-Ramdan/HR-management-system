package com.projects.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="users")
public class Users {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="ID")
	private int id ;
	 @Column(name="USERNAME")
	private String userNmae ;
	 @Column(name="PASSWORD")
	private String password ;
	
    
	
	
	

	

	
	
}
