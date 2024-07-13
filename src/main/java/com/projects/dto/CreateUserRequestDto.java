package com.projects.dto;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateUserRequestDto {
	
	private String userNmae ;
	private String password ;
	private String firstNameEn ;
	private String firstNameAr ;
	private String lastNameEn ;
	private String lastNameAr ;
	private int age ;
	private String address ;
	private String phoneNamber;
	private String email ;
	private BigDecimal salary ;
	private String jobDescription ;
	private int managerId ;
	private int titelId ;
	private int departmentId ;
	// private int userId ; what is this ?
	private String joinDate;
	

}
