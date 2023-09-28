package personal.project.employeesrestcrud.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String employeeId;
    private String firstName;
    @Nullable
    private String middleName;
    private String lastName;
    // private String mailId;
}
