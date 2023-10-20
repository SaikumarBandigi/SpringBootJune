package com.sb.employeeapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/*
Create Employee
UpdateEmployee
DeleteEmployee
Get All Employees
Get Individual Employee
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/post")
    public Employee creaEmp(@RequestBody Employee employee) {
        return employeeService.createEmp(employee);
    }
    // I have used Request Param
    // http://localhost:8080/api/employee/del?integer=2
    @DeleteMapping("/del")
    public void delEmp(Integer integer) {
        employeeService.deleteEmp(integer);
    }
    @GetMapping("/getAllEmps")
    public Iterable<Employee> getemps() {
        return employeeService.getALlEmps();
    }
    // I have used Request Param here means
    // http://localhost:8080/api/employee/getIndEmp?integer=2
    @GetMapping("/getIndEmp")
    public Optional<Employee> getInEm(Integer integer) {
        return employeeService.getIndivEmp(integer);
    }
    @PutMapping("/put")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmp(employee);
    }

}
