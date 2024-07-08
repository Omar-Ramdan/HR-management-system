package com.projects.model;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java. util. Date;

@Setter
@Getter
@Entity
@Table(name="employees")
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="ID")
	private int id ;
	 @Column(name="FIRST_NAME_EN")
	private String firstNameEN ;
	 @Column(name="FIRST_NAME_AR")
	private String firstNameAR ;
	 @Column(name="LAST_NAME_EN")
	private String lastNameEN ;
	 @Column(name="LAST_NAME_AR")
	private String lastNameAR ;
	 @Column(name="AGE")
	private int age ;
	 @Column(name="ADDRESS")
	private String address ;
	 @Column(name="PHONE_NUMBER")
	private String phoneNamber;
	 @Column(name="EMAIL")
	private String email ;
	 @Column(name="SALARY")
	private BigDecimal salary ;
	 @Column(name="JOB_DESCRIPTION")
	private String jobDescrption ;
	 @Column(name="MANAGER_ID")
	private int managerId ;
	 @Column(name="TITEL_ID")
	private int titelId ;
	 @Column(name="DEPARTMENT_ID")
	private int departmentId ;
	 @Column(name="USER_ID")
	private int userId ;
	 @Column(name="JOIN_DATE")
    private Date joinDate;
	public Employees(String firstNameEN, String firstNameAR, String lastNameEN, String lastNameAR, int age,
			String address, String phoneNamber, String email, BigDecimal salary, String jobDescrption, int managerId,
			int titelId, int departmentId, int userId, Date joinDate) {
		super();
		this.firstNameEN = firstNameEN;
		this.firstNameAR = firstNameAR;
		this.lastNameEN = lastNameEN;
		this.lastNameAR = lastNameAR;
		this.age = age;
		this.address = address;
		this.phoneNamber = phoneNamber;
		this.email = email;
		this.salary = salary;
		this.jobDescrption = jobDescrption;
		this.managerId = managerId;
		this.titelId = titelId;
		this.departmentId = departmentId;
		this.userId = userId;
		this.joinDate = joinDate;
	}
    
    
	
    
    
    
    

	}

