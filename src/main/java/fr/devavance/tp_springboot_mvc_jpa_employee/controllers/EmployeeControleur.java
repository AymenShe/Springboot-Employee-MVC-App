package fr.devavance.tp_springboot_mvc_jpa_employee.controllers;

import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Fonction;
import fr.devavance.tp_springboot_mvc_jpa_employee.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeControleur implements IEmployeeController {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @RequestMapping(value ="/home", method = RequestMethod.GET)
    public String displayHome(Model model){
        model.addAttribute("employees",iEmployeeRepository.findAll());
        model.addAttribute("employee",new Employee());
        return "view_home";
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee, @RequestParam String color){
        employee.setFonction(Fonction.valueOf(color));
        iEmployeeRepository.save(employee);

        return "redirect:/employee/home";
    }
}
