package com.projects.DTO;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class createUserDto {
	
	private String userNmae ;
	private String password ;
	private String firstNameEN ;
	private String firstNameAR ;
	private String lastNameEN ;
	private String lastNameAR ;
	private int age ;
	private String address ;
	private String phoneNamber;
	private String email ;
	private BigDecimal salary ;
	private String jobDescrption ;
	private int managerId ;
	private int titelId ;
	private int departmentId ;
	private int userId ;
	private Date joinDate;
	

}
