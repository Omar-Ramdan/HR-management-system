package com.projects.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
