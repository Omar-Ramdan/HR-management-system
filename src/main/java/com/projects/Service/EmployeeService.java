package com.projects.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.projects.Repository.EmployeesRepository;

import com.projects.model.Employees;

@Service
@Transactional
public class EmployeeService {

	private final EmployeesRepository employeesRepository;
	
	  //Construct injection
		public EmployeeService(EmployeesRepository employeesRepository) {

			this.employeesRepository = employeesRepository;

		}

		
		public void saveMyEmployee(Employees employee) {

			employeesRepository.save(employee);
		}
	
}
