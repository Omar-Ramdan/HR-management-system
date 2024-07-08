package com.projects.Repository;

import org.springframework.data.repository.CrudRepository;

import com.projects.model.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
