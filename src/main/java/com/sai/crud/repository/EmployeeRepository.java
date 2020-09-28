package com.sai.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
