package pl.edu.pbs.carrent.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pbs.carrent.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
