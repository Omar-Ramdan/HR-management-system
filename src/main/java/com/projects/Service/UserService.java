package com.projects.Service;

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
		public void saveMyUser(Users user) {

			userRepository.save(user);
		}
		
		
}