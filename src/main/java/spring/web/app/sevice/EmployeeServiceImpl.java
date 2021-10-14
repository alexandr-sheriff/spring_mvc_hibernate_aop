package spring.web.app.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.web.app.dao.EmployeeDAO;
import spring.web.app.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int empId) {
        return employeeDAO.getEmployee(empId);
    }

    @Override
    @Transactional
    public void deleteEmployee(int empId) {
        employeeDAO.deleteEmployee(empId);
    }

}
