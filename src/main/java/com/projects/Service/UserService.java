package com.projects.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.projects.Repository.UserRepository;

import com.projects.model.Users;


@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;
	
	  //Construct injection
		public UserService(UserRepository userRepository) {

			this.userRepository = userRepository;

		}
		
		
		 public  byte[] getSHA(String input) throws      NoSuchAlgorithmException {  
			 // The Static method " getInstance() " is called to initiate hashing with SHA  
			        MessageDigest md = MessageDigest.getInstance("SHA-256");  
			  
			        // The static method called in the JAVA program  
			        // for calculating the message digest of a given input  
			        // and results in an array of byte  
			        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
			    }
		
		    public  String toHexString(byte[] hash) {  
		        // calling the " BigInteger " function in JAVA programming language.  
		        BigInteger number = new BigInteger(1, hash);  
		  
		        // Converting the message digest into a Hexa decimal value.  
		        StringBuilder hexString = new StringBuilder(number.toString(16));  
		  
		        while (hexString.length() < 64) {  
		            hexString.insert(0, '0');  
		        }  
		  
		        return hexString.toString();  
		    }  
		
		public Users  createUser(Users user) {
			
			try {
				user. =  toHexString(getSHA(password));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		  return userRepository.save(user);
		}
		
		
}