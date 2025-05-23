package com.zaurtregulov.spring.springboot.spring_data.dao;

import com.zaurtregulov.spring.springboot.spring_data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
public List<Employee> findAllByName(String name);
}

