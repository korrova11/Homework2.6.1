package pro.sky.java.course2.homework261.employee;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework261.exception.EmployeeAlreadyAddedException;
import pro.sky.java.course2.homework261.exception.EmployeeNotFoundException;
import pro.sky.java.course2.homework261.exception.EmployeeStoragelsFullException;

import java.util.ArrayList;
import java.util.List;

@Service


public class EmployeeService {
    private final int NUMBER = 10;

    List<Employee> employeeList = new ArrayList<>(List.of(
            new Employee("Иван", "Иванов"),
            new Employee("Петр", "Петров")

    ));


    public void addEmployee(Employee employee) {
        if (employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        } else if (employeeList.size() < NUMBER) {
            employeeList.add(employee);
            // return "Сотрудник добавлен";
        } else {
            throw new EmployeeStoragelsFullException();
        }
    }

    public void removeEmployee(Employee employee) {
        if (!employeeList.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        } else {
            employeeList.remove(employee);

        }
    }

    public Employee containsEmployee(Employee employee) {
        if (employeeList.contains(employee)) {
            return employee;
        } else {

            throw new EmployeeNotFoundException();

        }
    }


    public List<Employee> list() {
        return employeeList;
    }
}





