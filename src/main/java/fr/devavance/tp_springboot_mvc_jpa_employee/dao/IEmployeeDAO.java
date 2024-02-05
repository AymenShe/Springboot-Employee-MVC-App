package fr.devavance.tp_springboot_mvc_jpa_employee.dao;

import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Employee;

import java.util.ArrayList;

public interface IEmployeeDAO {
    public ArrayList<Employee> findAll();

    public Employee add(Employee employee);
}
