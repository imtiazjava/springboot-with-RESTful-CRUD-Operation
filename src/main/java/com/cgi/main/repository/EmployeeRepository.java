package com.cgi.main.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.main.entity.Employee;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employee,Integer> {
	
	public List<Employee> sortByName(String name);
	
}
