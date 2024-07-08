package com.projects.Service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import com.projects.Repository.DepartmentsRepository;

import com.projects.model.Departments;
import com.projects.model.Employees;

@Service
@Transactional
public class DepartmentService {

	private final DepartmentsRepository departmentsRepository;
	
	  //Construct injection
		public DepartmentService(DepartmentsRepository departmentsRepository) {

			this.departmentsRepository = departmentsRepository;

		}
		public void saveMyDepartment(Departments department) {

			departmentsRepository.save(department);
		}
	
}
