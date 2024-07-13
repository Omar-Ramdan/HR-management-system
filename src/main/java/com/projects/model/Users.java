package com.projects.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;  
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="users")
public class Users {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="ID")
	private long  id ;

	 @Column(name="USERNAME")
	private String userName ;
	 @Column(name="PASSWORD")
	private String password ;
	
    
	
	
	

	

	
	
}
