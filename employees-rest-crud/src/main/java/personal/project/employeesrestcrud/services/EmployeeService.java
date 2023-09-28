package personal.project.employeesrestcrud.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import personal.project.employeesrestcrud.model.Employee;
import personal.project.employeesrestcrud.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public String addEmployee(Employee employee, Model model) {

        model.addAttribute("employees", repository.save(employee));
        System.out.println(repository.findAll());
        return "index";
    }

    public List<Employee> fetchAll() {

        return repository.findAll();
    }
}
