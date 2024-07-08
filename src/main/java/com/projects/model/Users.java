package com.projects.model;

import jakarta.persistence.Table;
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
	

	
	 public static byte[] getSHA(String input) throws      NoSuchAlgorithmException {  
		 // The Static method " getInstance() " is called to initiate hashing with SHA  
		        MessageDigest md = MessageDigest.getInstance("SHA-256");  
		  
		        // The static method called in the JAVA program  
		        // for calculating the message digest of a given input  
		        // and results in an array of byte  
		        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
		    }
	
	    public static String toHexString(byte[] hash) {  
	        // calling the " BigInteger " function in JAVA programming language.  
	        BigInteger number = new BigInteger(1, hash);  
	  
	        // Converting the message digest into a Hexa decimal value.  
	        StringBuilder hexString = new StringBuilder(number.toString(16));  
	  
	        while (hexString.length() < 64) {  
	            hexString.insert(0, '0');  
	        }  
	  
	        return hexString.toString();  
	    }  
	
	
	
	
	public Users(String userNmae, String password) {
			super();
			this.userNmae = userNmae;
			try {
				this.password =  toHexString(getSHA(password));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	

	

	
	
}
