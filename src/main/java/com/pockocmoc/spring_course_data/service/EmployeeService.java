package com.pockocmoc.spring_course_data.service;

import com.pockocmoc.spring_course_data.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
    public List<Employee> findAllByName(String name);
}
