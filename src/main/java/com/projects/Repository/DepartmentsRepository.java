package com.projects.Repository;

import org.springframework.data.repository.CrudRepository;

import com.projects.model.Departments;

public interface DepartmentsRepository extends CrudRepository<Departments, Integer> {

}