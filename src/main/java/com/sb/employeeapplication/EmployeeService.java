package com.sb.employeeapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
Create Employee
UpdateEmployee
DeleteEmployee
Get All Employees
Get Individual Employee

 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // create employee
    public Employee createEmp(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Update Employee
    public Employee updateEmp(Employee employee) {
        Employee employee1 = employeeRepository.findById(employee.getEmpid()).orElse(new Employee());
        employee1.setEmpname(employee.getEmpname());
        employeeRepository.save(employee1);
        return employee1;
    }

    // Delete Employee
    public void deleteEmp(Integer empid) {
        employeeRepository.deleteById(empid);
    }

    // get ALl employess
    public Iterable<Employee> getALlEmps() {
        return employeeRepository.findAll();
    }

    //Get Individual Employee
    public Optional<Employee> getIndivEmp(Integer integer) {
        return employeeRepository.findById(integer);
    }

}
