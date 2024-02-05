package fr.devavance.tp_springboot_mvc_jpa_employee.dao;

import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa_employee.beans.Fonction;

import java.util.ArrayList;

public class EmployeeDAOImpl implements IEmployeeDAO{

    ArrayList<Employee> Employees;

    public EmployeeDAOImpl(){
        this.Employees = new ArrayList<Employee>();

        Employee employee1 = new Employee("Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB);
        Employee employee2 = new Employee("Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS);
        Employee employee3 = new Employee("Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET);
        Employee employee4 = new Employee("Idam Wilson", "idamwilson@mail.com", "(204) 619-5331", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_AI);
        Employee employee5 = new Employee("Peter Perrier", "peterperrier@mail.com", "(313) 555-5735", "Obere Str. 57, Berlin, Germany", Fonction.DEV_WEB);
        Employee employee6 = new Employee("Mark Hardy", "markshardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_OPS);

        this.Employees.add(employee1);
        this.Employees.add(employee2);
        this.Employees.add(employee3);
        this.Employees.add(employee4);
        this.Employees.add(employee5);
        this.Employees.add(employee6);
    }
    @Override
    public ArrayList<Employee> findAll() {
        for (Employee employee  : this.Employees) {
            System.out.println(employee.getName() + " " + employee.getId());
        };
        return this.Employees;
    }

    @Override
    public Employee add(Employee employee) {
        this.Employees.add(employee);
        return this.Employees.get(this.Employees.size() - 1);
    }
}
