package fr.devavance.tp_springboot_mvc_jpa_employee.dao;

import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IEmployeeRepository extends CrudRepository<Employee, Long>  {
    @Override
    public ArrayList<Employee> findAll();

    @Override
    public Employee save(Employee employee);
}
