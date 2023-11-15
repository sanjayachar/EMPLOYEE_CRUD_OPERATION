package com.example.SpringCrudOpProject2.Service;

import com.example.SpringCrudOpProject2.Model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
