package fr.devavance.employees.repository;

import fr.devavance.employees.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IEmployeeRepository extends CrudRepository<Employee, Long>  {
    @Override
    public ArrayList<Employee> findAll();

    @Override
    public Employee save(Employee employee);
}
