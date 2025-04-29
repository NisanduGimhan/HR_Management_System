package edu.icet.ecom.service;

import edu.icet.ecom.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void save(Employee employee);

    Employee findById(Long id);

    void deleteById(Long id);

    void update(Employee customer);

    List<Employee> findall();
}
