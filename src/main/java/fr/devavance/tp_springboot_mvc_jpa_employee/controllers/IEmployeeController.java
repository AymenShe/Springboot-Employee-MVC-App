package fr.devavance.tp_springboot_mvc_jpa_employee.controllers;

import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public interface IEmployeeController {
    public String displayHome(Model model);
    public String addEmployee(Employee employee, String color);
}
