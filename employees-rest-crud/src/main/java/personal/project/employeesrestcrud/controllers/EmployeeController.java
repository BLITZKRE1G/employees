package personal.project.employeesrestcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import personal.project.employeesrestcrud.model.Employee;
import personal.project.employeesrestcrud.services.EmployeeService;

@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {

    private final EmployeeService service;

    EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping(value = "/sign-up")
    public String showSignupForm(Employee employee) {
        return "add-user";
    }

    @PostMapping(value = "/add-user")
    public String addUser(@RequestBody Employee employee, Model model) {

        return service.addEmployee(employee, model);
    }

    @GetMapping(value = "/index")
    public String showUserList(Model model) {

        model.addAttribute("employees", service.fetchAll());
        return "index";
    }
}
