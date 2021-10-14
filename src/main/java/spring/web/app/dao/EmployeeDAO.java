package spring.web.app.dao;

import spring.web.app.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int empId);

    void deleteEmployee(int empId);
}
