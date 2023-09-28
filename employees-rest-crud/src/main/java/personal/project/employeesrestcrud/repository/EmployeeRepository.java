package personal.project.employeesrestcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import personal.project.employeesrestcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
