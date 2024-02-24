package fr.devavance.employees.controllers.implementation;

import fr.devavance.employees.entity.Employee;
import fr.devavance.employees.controllers.IEmployeeController;
import fr.devavance.employees.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String addEmployee(@ModelAttribute Employee employee){
        iEmployeeRepository.save(employee);

        return "redirect:/employee/home";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String displayEmployee(@PathVariable(name = "id") Long id, Model model){

        iEmployeeRepository.findById(id).ifPresentOrElse(employee -> model.addAttribute("employee_selected",employee),() -> model.addAttribute("employee_selected", new Employee()));
        return "view_employee";
    }
}
