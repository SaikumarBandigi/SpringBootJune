package com.sb.employeeapplication;

import javax.persistence.*;
import java.util.Date;

/*empid
        empame,
        designation,
        salary,
        addrees
*/

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private int empid;

    @Column(name = "emp_name")
    private String empname;

    private String designation;
    private long salary;
    private String address;


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee() {
    }

    public Employee(int empid, String empname, String designation, long salary, String address) {
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
