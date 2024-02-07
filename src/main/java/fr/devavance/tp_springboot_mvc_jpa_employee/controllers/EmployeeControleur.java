package fr.devavance.tp_springboot_mvc_jpa_employee.controllers;

import fr.devavance.tp_springboot_mvc_jpa_employee.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EmployeeControleur {
    @Autowired
    private IEmployeeDAO iEmployeeDAO;

    @GetMapping("/findAllEmployee")
    public String findAllEmployee(Model model){
        model.addAttribute("employees",iEmployeeDAO.findAll());
        return "view_employees";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Model model){
        
        return "view_employees";
    }
}
