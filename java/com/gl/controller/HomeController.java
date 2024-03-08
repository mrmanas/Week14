package com.gl.controller;

import com.gl.model.Employee;
import com.gl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String Home()
    {
    	return "home";
    }
    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "allemployees";
    }

    @GetMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addemployee";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

    @GetMapping("/editEmployee/{id}")
    public String showEditForm(@PathVariable("id") long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "addemployee";
    }

    @PostMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable("id") long id, @ModelAttribute("employee") Employee employee) {
        employee.setId(id); // Set the id for the employee
        employeeService.updateEmployee(employee);
        return "redirect:/employees";
    }
}
