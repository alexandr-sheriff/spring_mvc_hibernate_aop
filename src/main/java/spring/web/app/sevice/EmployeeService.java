package spring.web.app.sevice;

import spring.web.app.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployee(int empId);

    void deleteEmployee(int empId);
}
