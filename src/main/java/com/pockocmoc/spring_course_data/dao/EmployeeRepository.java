package com.pockocmoc.spring_course_data.dao;

import com.pockocmoc.spring_course_data.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    public List<Employee> findAllByName(String name);
}
