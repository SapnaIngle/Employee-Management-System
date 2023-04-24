package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
