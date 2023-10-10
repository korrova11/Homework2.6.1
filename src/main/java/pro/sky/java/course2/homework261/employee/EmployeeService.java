package pro.sky.java.course2.homework261.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service


public class EmployeeService {
    private final int number = 10;
    private Employee employee;
    List<Employee> employeeList = new ArrayList<>(List.of(
            new Employee("Иван", "Иванов"),
            new Employee("Петр", "Петров")

    ));


    public EmployeeService(Employee employee) {
        this.employee = employee;
    }
    //List<Employee> employeeList;
    // public EmployeeService(List<Employee> employeeList) {
    //    this.employeeList = employeeList;
    // }

    public String addEmployee(Employee employee) {
        employeeList.add(employee);
        return "Сотрудник добавлен";
    }

    public String removeEmployee(Employee employee) {
        employeeList.remove(employee);
        return "Сотрудник удален";
    }

    public String containsEmployee(Employee employee) {
        if (employeeList.contains(employee)) {
            return "Сотрудник есть в списке";
        } else {
            return "Сотрудника нет в списке";
        }
    }


}

